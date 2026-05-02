package pe.edu.ulima.is2.patrones.adapter;

public class MonitoringSystem {
    private LegacyEmailLib emailService;
    private FastSMS_Adaptee smsService;
    private int notificationType;

    public MonitoringSystem(){
        this.emailService = new LegacyEmailLib();
        this.smsService = new FastSMS_Adaptee();
    }
    public void processAlerts(){
        if(notificationType ==0){
            emailService.sendEmail("citrix@gmail.com", "Titulo", "Contenido");
        }else{
            smsService.sendInstanceMessage("123456789","rui");
        }

    }

    public int getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(int notificationType) {
        this.notificationType = notificationType;
    }
}
