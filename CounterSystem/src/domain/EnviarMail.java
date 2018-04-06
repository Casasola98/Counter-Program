
package domain;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;

public class EnviarMail {
    String miCorreo;
    String miContraseña;
    String servidorSMTP = "smtp.gmail.com";
    String puertoEnvio = "465";
    String mailReceptor;
    String asunto;
    String cuerpo;
    
    public EnviarMail(String mailReceptor, String asunto, String cuerpo) {
        this.miCorreo = "countersyst@gmail.com";
        this.miContraseña = "counterSys";
        this.mailReceptor = mailReceptor;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        Properties props = new Properties();//propiedades a agragar
        props.put("mail.smtp.user", this.miCorreo);//correo origen
        props.put("mail.smtp.host", servidorSMTP);//tipo de servidor
        props.put("mail.smtp.port", puertoEnvio);//puesto de salida
        props.put("mail.smtp.starttls.enable", "true");//inicializar el servidor
        props.put("mail.smtp.auth", "true");//autentificacion
        props.put("mail.smtp.socketFactory.port", puertoEnvio);//activar el puerto
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");
        SecurityManager security = System.getSecurityManager();
        try {
            Authenticator auth = new autentificadorSMTP();//autentificar el correo
            Session session = Session.getInstance(props, auth);//se inica una session
            MimeMessage msg = new MimeMessage(session);//se crea un objeto donde ira la estructura del correo
            msg.setText(this.cuerpo);//seteo el cuertpo del mensaje
            msg.setSubject(this.asunto);//setea asusto (opcional)
            msg.setFrom(new InternetAddress(this.miCorreo));//agrega la la propiedad del correo origen
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(this.mailReceptor));//agrega el destinatario
            Transport.send(msg);//envia el mensaje
            JOptionPane.showMessageDialog(null, "Email enviado");//alerta de que mensaje fue enviado correctamente
        } catch (Exception mex) {//en caso de que ocurra un error se crea una excepcion
            JOptionPane.showMessageDialog(null, "Email no enviado");//muestra con cuadro de dialogo un mensaje que correo no fue enviado
        }//fin try-catch
    }//fin metodo enviaEmail
    private class autentificadorSMTP extends javax.mail.Authenticator {
        @Override
        public PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(miCorreo, miContraseña);//autentifica tanto el correo como la contraseña
        }
    }
    
}

