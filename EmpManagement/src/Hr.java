public class Hr {
    private  String username;
    private String password;

    public String getUsername(){
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Hr{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Hr(String username,String password){
        //super();
        this.password=password;
        this.username=username;

    }
}
