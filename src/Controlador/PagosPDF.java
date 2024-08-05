package Controlador;

import Conexion.Conexion;
import Vista.InternalPagoServicios;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.awt.Desktop;
import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PagosPDF {

    private String User;
    private String cedulaUser;
    private String telefonoUser;
    private String direccionUser;
    private String fecha_actal = "";
    private String nombrePDF = "";

    private String ruta;

    public PagosPDF(String ruta) {
        this.ruta = ruta;
    }

    public PagosPDF() {
    }
    
    

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String Ruta(){
        Date date = new Date();
        fecha_actal = new SimpleDateFormat("yyyy/MM/dd").format(date);

        String fechaNueva = "";
        for (int i = 0; i < fecha_actal.length(); i++) {
            if (fecha_actal.charAt(i) == '/') {
                fechaNueva = fecha_actal.replace('/', '_');
            }
        }

        nombrePDF = "Factura_" + User + "_" + fechaNueva + ".pdf";
        return ruta = "src/pdf/"+nombrePDF;
    }
    
    public void DatosUsuario(int idUsuario) {
        Connection cn = Conexion.establecerConexion();
        String sql = "select * from usuarios where id_usuario = '" + idUsuario + "'";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while (rs.next()) {
                User = rs.getString("nombre") + " " + rs.getString("apellido");
                cedulaUser = rs.getString("id_usuario");
                telefonoUser = rs.getString("telefono");
                direccionUser = rs.getString("direccion");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener datos " + e);
        }
    }

    public void GenerarPDF() {

        try {
            
            FileOutputStream archivo;
            File file = new File(this.Ruta());
            archivo = new FileOutputStream(file);
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();

            Image img = Image.getInstance("src/img/pagoServicio.png");

            Paragraph fecha = new Paragraph();
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLACK);
            fecha.add(Chunk.NEWLINE);
            fecha.add("Factura: 001" + "\nFecha: " + fecha_actal + "\n\n");

            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);

            float[] columnaEncabezado = new float[]{20f, 30f, 70f, 40f};
            Encabezado.setWidths(columnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            Encabezado.addCell(img);

            String ruc = "1926029595262";
            String nombre = "Payment Service";
            String telefono = "9514842685";
            String direccion = "Ciudad de Mexico";

            Encabezado.addCell("");
            Encabezado.addCell("RUC: " + ruc + "\nNombre: " + nombre + "\nTelefono: " + telefono + "\nDireccion: " + direccion);
            Encabezado.addCell(fecha);

            doc.add(Encabezado);

            Paragraph Usuario = new Paragraph();
            Usuario.add(Chunk.NEWLINE);
            Usuario.add("Datos del Usuario." + "\n\n");
            doc.add(Usuario);

            PdfPTable tablaUser = new PdfPTable(4);
            tablaUser.setWidthPercentage(100);
            tablaUser.getDefaultCell().setBorder(0);

            float[] columnaUser = new float[]{25f, 45f, 30f, 40f};
            tablaUser.setWidths(columnaUser);
            tablaUser.setHorizontalAlignment(Element.ALIGN_LEFT);

            PdfPCell User1 = new PdfPCell(new Phrase("Cédula: ", negrita));
            PdfPCell User2 = new PdfPCell(new Phrase("Nombre: ", negrita));
            PdfPCell User3 = new PdfPCell(new Phrase("Teléfono: ", negrita));
            PdfPCell User4 = new PdfPCell(new Phrase("Dirección: ", negrita));

            User1.setBorder(0);
            User2.setBorder(0);
            User3.setBorder(0);
            User4.setBorder(0);

            tablaUser.addCell(User1);
            tablaUser.addCell(User2);
            tablaUser.addCell(User3);
            tablaUser.addCell(User4);
            tablaUser.addCell(cedulaUser);
            tablaUser.addCell(User);
            tablaUser.addCell(telefonoUser);
            tablaUser.addCell(direccionUser);

            doc.add(tablaUser);

            Paragraph esp = new Paragraph();
            esp.add(Chunk.NEWLINE);
            esp.add("");
            esp.setAlignment(Element.ALIGN_CENTER);
            doc.add(esp);
            Paragraph esp2 = new Paragraph();
            esp2.add(Chunk.NEWLINE);
            esp2.add("");
            esp2.setAlignment(Element.ALIGN_CENTER);
            doc.add(esp);
            Paragraph esp3 = new Paragraph();
            esp3.add(Chunk.NEWLINE);
            esp3.add("");
            esp3.setAlignment(Element.ALIGN_CENTER);
            doc.add(esp);

            PdfPTable tablaServicio = new PdfPTable(4);
            tablaServicio.setWidthPercentage(100);
            tablaServicio.getDefaultCell().setBorder(0);

            float[] columnaServicio = new float[]{30f, 50f, 30f, 40f};
            tablaServicio.setWidths(columnaServicio);
            tablaServicio.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell Serv1 = new PdfPCell(new Phrase("ID_Servicio", negrita));
            PdfPCell Serv2 = new PdfPCell(new Phrase("Nombre del Servicio", negrita));
            PdfPCell Serv3 = new PdfPCell(new Phrase("", negrita));
            PdfPCell Serv4 = new PdfPCell(new Phrase("Monto", negrita));

            Serv1.setBorder(0);
            Serv2.setBorder(0);
            Serv3.setBorder(0);
            Serv4.setBorder(0);

            Serv1.setBackgroundColor(BaseColor.LIGHT_GRAY);
            Serv2.setBackgroundColor(BaseColor.LIGHT_GRAY);
            Serv3.setBackgroundColor(BaseColor.LIGHT_GRAY);
            Serv4.setBackgroundColor(BaseColor.LIGHT_GRAY);

            tablaServicio.addCell(Serv1);
            tablaServicio.addCell(Serv2);
            tablaServicio.addCell(Serv3);
            tablaServicio.addCell(Serv4);

            String idServicio = InternalPagoServicios.txtServicio.getText();
            String NombreServicio = InternalPagoServicios.txtServicio1.getText();
            String a = "";
            String Total = InternalPagoServicios.txtMonto.getText();

            tablaServicio.addCell(idServicio);
            tablaServicio.addCell(NombreServicio);
            tablaServicio.addCell(a);
            tablaServicio.addCell(Total);

            doc.add(tablaServicio);

            Paragraph esp1 = new Paragraph();
            esp1.add(Chunk.NEWLINE);
            esp1.add("");
            esp1.setAlignment(Element.ALIGN_CENTER);
            doc.add(esp);

            Paragraph total = new Paragraph();
            total.add(Chunk.NEWLINE);
            total.add("Total a Pagar: $" + InternalPagoServicios.txtMonto.getText());
            total.setAlignment(Element.ALIGN_RIGHT);

            doc.add(total);

            Paragraph firma = new Paragraph();
            firma.add(Chunk.NEWLINE);
            firma.add("Firma\n\n\n");
            firma.add("_________________");
            firma.setAlignment(Element.ALIGN_CENTER);

            doc.add(firma);

            doc.close();
            archivo.close();

            Desktop.getDesktop().open(file);

        } catch (DocumentException | IOException e) {
            System.out.println("Error en : " + e);
        }
    }
}
