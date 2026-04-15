package ass5;

class ChatRoom{
    public void showMessage(String msg){
        System.out.println(msg);
    }
}
class User{
    ChatRoom cr=new ChatRoom();
    private String name;
    User(String name){
        this.name=name; 
    }
    public void getName(){
        System.out.println(name);
    }
    public void setName(String name){
        this.name=name;
    }
    public void SendMessage(String msg){
        cr.showMessage(msg);
    }

}
class MediatorPatternDemo{
    public static void main(String[] args) {
        User rohan=new User("Rohan");
        User rakesh=new User("Rakesh");
        rohan.SendMessage("Hello Rakesh!");
        rakesh.SendMessage("Hello Rohan!");
    }
}
