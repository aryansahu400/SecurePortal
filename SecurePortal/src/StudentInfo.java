public class StudentInfo {
    public String enrollmentNumber;
    public String name;
    public String email;
    public String password;
    public String school;
    public String branch;
    public String special;
    public String lastLogIn;
    public String lastLogOut;
    public String lastLogOutTime;
    public String attendence;
    
    StudentInfo(){
    }
    StudentInfo(String e,String n,String em, String pa, String s,String b,String sp,String lli, String llo, String llot, String at ){
        name=n;
        enrollmentNumber=e;
        school=s;
        branch=b;
        special=sp;
        email=em;
        password=pa;
        lastLogIn=lli;
        lastLogOut=llo;
        lastLogOutTime=llot;
        attendence=at;
        
        
    }
    
}
