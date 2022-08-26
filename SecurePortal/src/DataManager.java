import java.sql.*;
import javax.swing.JOptionPane;

public class DataManager {
    private static Connection connector()throws SQLException{
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Secure","aryansahu400","Aryansahu@400");
        return con;
    }
    public static void inserter(StudentInfo st){
        try{
            Connection con=DataManager.connector();
            PreparedStatement pa = con.prepareStatement("insert into details values(?,?,?,?,?,?,?,?,?,?,?)");
            pa.setString(1,st.enrollmentNumber);
            pa.setString(2,st.name);
            pa.setString(3,st.email);
            pa.setString(4,st.password);
            pa.setString(5,st.school);
            pa.setString(6,st.branch);
            pa.setString(7,st.special);
            pa.setString(8,st.lastLogIn+"");
            pa.setString(9,st.lastLogOut+"");
            pa.setString(10,st.lastLogOutTime+"");
            pa.setString(11,"0");
            pa.executeUpdate();
        }catch(SQLException e){JOptionPane.showMessageDialog(null,"Error: 404, TRY AGAIN");}
    }

    public static boolean isPresent(String e1, String e2 , String pass)throws SQLException{
        Connection con=DataManager.connector();
        PreparedStatement pa=con.prepareStatement("select * from details");
        ResultSet rs=pa.executeQuery();
            while(rs.next()){
               String en=rs.getString(1);
               String em=rs.getString(3);
               String p=rs.getString(4);
               if(en.equalsIgnoreCase(e1) && pass.equals(p))return true;
               else if(pass.equals(p) && em.equalsIgnoreCase(e2)) return true;
            }
        return false;
    }
    
    public static void del(String e){
        try{
            Connection con=DataManager.connector();
            
            PreparedStatement st= con.prepareStatement("DELETE FROM details WHERE enrollmentnumber = ?");
            st.setString(1,e);
            st.executeUpdate();
    
        }catch(SQLException ex){JOptionPane.showMessageDialog(null,"Error: 404, TRY AGAIN");}
    }
    public static void insertAt(String enroll, String columb, String value ){
        try{
            Connection con=DataManager.connector();
            String s="UPDATE details SET "+columb+" = ? WHERE enrollmentnumber = ?";
            PreparedStatement ps=con.prepareStatement(s);
            ps.setString(1,value);
            ps.setString(2,enroll);
            ps.executeUpdate();
            }catch(SQLException ex){JOptionPane.showMessageDialog(null,"Error: 404, TRY AGAIN");}
    }
    public static int getAttendence(String enroll){
        try{
        Connection con=DataManager.connector();
        String s="SELECT * details WHERE enrollmentnumber = ?";
        PreparedStatement ps=con.prepareStatement(s);
        ps.setString(1, enroll);
        ResultSet rs=ps.executeQuery();
        int a=Integer.parseInt(rs.getString(11));
        }catch(SQLException ex){JOptionPane.showMessageDialog(null,"Error: 404, TRY AGAIN");}
        return 0;
    }
    public static void addLogInTime(String e, String t){
        insertAt(e,"lastlogin",t);
    }
    public static void lastLogOut(String enroll, String value){
        insertAt(enroll,"lastlogout", value);
    }
    public static void lastLogInTime(String enroll, String value){
        insertAt(enroll,"lastlogintime", value);
    }
    public static void attendence(String enroll, String value){
        insertAt(enroll,"attendence", value);
    }
    
    
}
