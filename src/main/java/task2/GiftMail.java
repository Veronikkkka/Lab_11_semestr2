package task2;

public class GiftMail implements MailCode{
    private static String TEMPLATE = "Black Friday: %NAME receive your discount";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%NAME", client.getName());
    }
}
