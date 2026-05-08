package ulima.Adapter;

public class MonitoringSystem {

    private LegacyEmailLib emailService;
    private FastSMS_Adaptee smsService;
    private int notificationType = 0;


    public MonitoringSystem() {
        this.emailService = new LegacyEmailLib();
        this.smsService = new FastSMS_Adaptee();
    }

    public int getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(int notificationType) {
        this.notificationType = notificationType;
    }

    public void processAlerts(){
        if(notificationType == 0){
            emailService.sendEmail("miau@gmail.edu.pe",
                    "Titulo","contenido prueba");
        }else{
            smsService.sendInstantMessage("123456789","hola");
        }
    }
}
