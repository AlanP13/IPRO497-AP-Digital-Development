
package hotelmanagement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ghost Protocol
 */
public class database {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/hotelmanagement";
    static final String USER = "root";
    static final String pass = "admin"; //changeaccordingly
static Connection cn=null;
static java.sql.Statement stm;
public static void connect(){   
try{
Class.forName(JDBC_DRIVER);
        cn=DriverManager.getConnection(DB_URL, USER, pass);
        stm=cn.createStatement();
}catch(Exception e){
}
}
public static void createAdmin(adminbin a)
{
    try {
        connect();
        String sql="insert into admin(title,firstname,lastname,fathersname,gender,dob,contactno,maritalstatus,emailid,nationality,state,city,address,idproof,idno,password) values ('"+a.getTitle()+"','"+a.getName()+"','"+a.getLname()+"','"+a.getFname()+"','"+a.getGender()+"','"+a.getDob()+"','"+a.getContact()+"','"+a.getMstatus()+"','"+a.getEmailid()+"','"+a.getNationality()+"','"+a.getState()+"','"+a.getCity()+"','"+a.getAddress()+"','"+a.getIdproof()+"','"+a.getIdno()+"','"+a.getPassword()+"')";
        stm.executeUpdate(sql); 
    } catch (Exception e) {
        e.printStackTrace();
    }
}
 public static List<adminbin> getAlladmin() 
 {
 
        List<adminbin> us = new ArrayList<adminbin>();
        try {
            connect();
            String sql;

            sql = "Select * from admin";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                adminbin a = new adminbin();
                
               a.title=rs.getString("title");
               a.adminid=rs.getInt("adminid");
               a.name=rs.getString("firstname");
               a.lname=rs.getString("lastname");
               a.fname=rs.getString("fathersname");
               a.gender=rs.getString("gender");
               a.dob=rs.getString("dob");
               a.contact=rs.getString("contactno");
               a.emailid=rs.getString("emailid");
               a.city=rs.getString("city");
               a.mstatus=rs.getString("maritalstatus");
               a.address=rs.getString("address");
               a.password=rs.getString("password");
               a.idproof=rs.getString("idproof");
               a.idno=rs.getString("idno");
               a.nationality=rs.getString("nationality");
               a.state=rs.getString("state");
                
               
                us.add(a);
            }
            rs.close();
            stm.close();
            cn.close();

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();

        } finally {
            //finally block used to close resources
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return us;
    }

    public static void createEmployee(employeebin e)
    {
     try {
        connect();
        String sql="insert into employee(title,firstname,lastname,fathersname,gender,dob,contactno,maritalstatus,emailid,nationality,state,city,address,idproof,idno,password) values ('"+e.getTitle()+"','"+e.getName()+"','"+e.getLname()+"','"+e.getFname()+"','"+e.getGender()+"','"+e.getDob()+"','"+e.getContact()+"','"+e.getMstatus()+"','"+e.getEmail()+"','"+e.getNationality()+"','"+e.getState()+"','"+e.getCity()+"','"+e.getAddress()+"','"+e.getIdproof()+"','"+e.getIdno()+"','"+e.getPassword()+"')";
        stm.executeUpdate(sql); 
    } catch (Exception ex) {
        ex.printStackTrace();
    }   
        
    }
    
    public static List<employeebin> getAllemployee() 
 {
 
        List<employeebin> us = new ArrayList<employeebin>();
        try {
            connect();
            String sql;

            sql = "Select * from employee";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                employeebin a = new employeebin();
 
                a.employeeid=rs.getInt("employeeid");
                a.name=rs.getString("firstname");
                a.lname=rs.getString("lastname");
                a.gender=rs.getString("gender");
                a.dob=rs.getString("dob");
                a.contact=rs.getString("contactno");
                a.email=rs.getString("emailid");
                a.city=rs.getString("city");
                a.password=rs.getString("password");
                us.add(a);
            }
            rs.close();
            stm.close();
            cn.close();

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();

        } finally {
            //finally block used to close resources
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return us;
    }
    public static void createCustomer(customerbin c)
{
    try {
        connect();
        String sql="insert into customer(title,firstname,lastname,fathersname,gender,dob,contactno,maritalstatus,emailid,nationality,state,city,address,idproof,idno) values ('"+c.getTitle()+"','"+c.getName()+"','"+c.getLname()+"','"+c.getFname()+"','"+c.getGender()+"','"+c.getDob()+"','"+c.getContact()+"','"+c.getMstatus()+"','"+c.getEmail()+"','"+c.getNationality()+"','"+c.getState()+"','"+c.getCity()+"','"+c.getAddress()+"','"+c.getIdproof()+"','"+c.getIdno()+"')";
        stm.executeUpdate(sql); 
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
    public static List<customerbin> getAllcustomer() 
 {
 
        List<customerbin> us = new ArrayList<customerbin>();
        try {
            connect();
            String sql;

            sql = "Select * from customer";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                customerbin a = new customerbin();
 
                a.customerid=rs.getInt("customerid");
                a.name=rs.getString("firstname");
                a.email=rs.getString("emailid");
                a.contact=rs.getString("contactno");
                a.dob=rs.getString("dob");
                a.address=rs.getString("address");
                a.city=rs.getString("city");
                a.lname=rs.getString("lastname");
                a.gender=rs.getString("gender");
               
                us.add(a);
            }
            rs.close();
            stm.close();
            cn.close();

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();

        } finally {
            //finally block used to close resources
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return us;
    
}
    public static List<employeebin> getAllemployeeByName(employeebin e) 
 {
 
        List<employeebin> us = new ArrayList<employeebin>();
        try {
            connect();
            String sql;

            sql = "Select * from employee where firstname='"+e.getName()+"'";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                employeebin a = new employeebin();
                a.title=rs.getString("title");
                a.employeeid=rs.getInt("employeeid");
                a.name=rs.getString("firstname");
                a.lname=rs.getString("lastname");
                a.fname=rs.getString("fathersname");
                a.gender=rs.getString("gender");
                a.dob=rs.getString("dob");
                a.contact=rs.getString("contactno");
                a.email=rs.getString("emailid");
                a.city=rs.getString("city");
               a.mstatus=rs.getString("maritalstatus");
               a.address=rs.getString("address");
               a.password=rs.getString("password");
               a.idproof=rs.getString("idproof");
               a.idno=rs.getString("idno");
               a.nationality=rs.getString("nationality");
               a.state=rs.getString("state");
               
                us.add(a);
            }
            rs.close();
            stm.close();
            cn.close();

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception ex) {
            //Handle errors for Class.forName
            ex.printStackTrace();

        } finally {
            //finally block used to close resources
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return us;
    }
    
    public static List<customerbin> getAllcustomerByName(customerbin c) 
 {
 
        List<customerbin> us = new ArrayList<customerbin>();
        try {
            connect();
            String sql;

            sql = "Select * from customer where firstname='"+c.getName()+"'";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                customerbin a = new customerbin();
 
               a.title=rs.getString("title");
                a.customerid=rs.getInt("customerid");
                a.name=rs.getString("firstname");
                a.lname=rs.getString("lastname");
                a.fname=rs.getString("fathersname");
                a.gender=rs.getString("gender");
                a.dob=rs.getString("dob");
                a.contact=rs.getString("contactno");
                a.email=rs.getString("emailid");
                a.city=rs.getString("city");
               a.mstatus=rs.getString("maritalstatus");
               a.address=rs.getString("address");
               a.idproof=rs.getString("idproof");
               a.idno=rs.getString("idno");
               a.nationality=rs.getString("nationality");
               a.state=rs.getString("state");
               
                us.add(a);
            }
            rs.close();
            stm.close();
            cn.close();

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();

        } finally {
            //finally block used to close resources
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return us;
    
}
     public static void createroomdetail(roombin r)
{
    try {
        connect();
        String sql="insert into roomdetail(totalroom,checkin,checkout,date,paymentoption,amount,customerid,customername,roomtype1,roomtype2,roomno1,roomno2) values ('"+r.getTotalroom()+"','"+r.getCheckin()+"','"+r.getCheckout()+"','"+r.getDate()+"','"+r.getPaymentoption()+"','"+r.getAmount()+"','"+r.getCustomerid()+"','"+r.getCustomername()+"','"+r.getRoomtype1()+"','"+r.getRoomtype2()+"','"+r.getRoomno1()+"','"+r.getRoomno2()+"')";
        stm.executeUpdate(sql); 
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
    public static List<roombin> getAllRoomdetail() 
 {
 
        List<roombin> us = new ArrayList<roombin>();
        try {
            connect();
            String sql;

            sql = "Select * from roomdetail";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                roombin r = new roombin();
 
               r.totalroom =rs.getInt("totalroom");
               r.checkin=rs.getString("checkin");
               r.checkout=rs.getString("checkout");
               r.date=rs.getString("date");
               r.paymentoption=rs.getString("paymentoption");
               r.amount=rs.getInt("amount");
               r.customerid=rs.getInt("customerid");
               r.customername=rs.getString("customername");
               r.roomtype1=rs.getString("roomtype1");
               r.roomtype2=rs.getString("roomtype2");
               r.roomno1=rs.getInt("roomno1");
               r.roomno2=rs.getInt("roomno2");
               
                us.add(r);
            }
            rs.close();
            stm.close();
            cn.close();

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();

        } finally {
            //finally block used to close resources
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return us;
    
}
    
     public static void createRoominsert(roombin r)
{
    try {
        connect();
        String sql="insert into roominsert(roomno,roomtype,roomprice,availability) values ('"+r.getRoomno()+"','"+r.getRoomtype()+"','"+r.getRoomprice()+"','"+r.getAvailability()+"')";
        stm.executeUpdate(sql); 
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
    public static List<roombin> getAllRoominsert() 
 {
 
        List<roombin> us = new ArrayList<roombin>();
        try {
            connect();
            String sql;

            sql = "Select * from roominsert";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                roombin r = new roombin();
 
                r.roomno=rs.getInt("roomno");
                r.roomtype=rs.getString("roomtype");
                r.roomprice=rs.getInt("roomprice");
                r.availability=rs.getString("availability");
               
                us.add(r);
            }
            rs.close();
            stm.close();
            cn.close();

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();

        } finally {
            //finally block used to close resources
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return us;
    
}
    public static List<roombin> getAllRoominsertByRoomno(roombin b) 
 {
 
        List<roombin> us = new ArrayList<roombin>();
        try {
            connect();
            String sql;

            sql = "Select * from roominsert where roomno='"+b.getRoomno()+"'";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                roombin r = new roombin();
 
                r.roomno=rs.getInt("roomno");
                r.roomtype=rs.getString("roomtype");
                r.roomprice=rs.getInt("roomprice");
                r.availability=rs.getString("availability");
               
                us.add(r);
            }
            rs.close();
            stm.close();
            cn.close();

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();

        } finally {
            //finally block used to close resources
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return us;
    
}
    
    public static List<roombin> getAllRoominsertByID(int id) 
 {
 
        List<roombin> us = new ArrayList<roombin>();
        try {
            connect();
            String sql;

            sql = "Select * from roominsert where roomprice='"+id+"'";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                roombin r = new roombin();
 
                r.roomno=rs.getInt("roomno");
                r.roomtype=rs.getString("roomtype");
                r.roomprice=rs.getInt("roomprice");
                r.availability=rs.getString("availability");
               
                us.add(r);
            }
            rs.close();
            stm.close();
            cn.close();

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();

        } finally {
            //finally block used to close resources
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return us;
    
}
    public static List<roombin> getAllRoomdetailByTotalroom(roombin b) 
 {
 
        List<roombin> us = new ArrayList<roombin>();
        try {
            connect();
            String sql;

            sql = "Select * from roomdetail where totalroom='"+b.getTotalroom()+"";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                roombin r = new roombin();
 
               r.totalroom =rs.getInt("totalroom");
               r.checkin=rs.getString("checkin");
               r.checkout=rs.getString("checkout");
               r.date=rs.getString("date");
               r.paymentoption=rs.getString("paymentoption");
               r.amount=rs.getInt("amount");
               r.customerid=rs.getInt("customerid");
               r.customername=rs.getString("customername");
               r.roomtype1=rs.getString("roomtype1");
               r.roomtype2=rs.getString("roomtype2");
               r.roomno1=rs.getInt("roomno1");
               r.roomno2=rs.getInt("roomno2");
                us.add(r);
            }
            rs.close();
            stm.close();
            cn.close();

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();

        } finally {
            //finally block used to close resources
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return us;
    
}
    
     public static void updateEmployee(employeebin eb)
{
    try {
        connect();
        String sql="update employee set title='"+eb.getTitle()+"',lastname='"+eb.getLname()+"',fathersname='"+eb.getFname()+"',gender='"+eb.getGender()+"',dob='"+eb.getDob()+"',contactno='"+eb.getContact()+"',maritalstatus='"+eb.getMstatus()+"',emailid='"+eb.getEmail()+"',nationality='"+eb.getNationality()+"',state='"+eb.getState()+"',city='"+eb.getCity()+"',address='"+eb.getAddress()+"',idproof='"+eb.getIdproof()+"',idno='"+eb.getIdno()+"',password='"+eb.getPassword()+"' where firstname='"+eb.getName()+"'";
        stm.executeUpdate(sql); 
    }   catch (Exception e) {
        e.printStackTrace();
    }
}
     public static void deleteEmployee(employeebin eb)
{
    try {
        connect();
        String sql="delete from employee where firstname='"+eb.getName()+"'";
        stm.executeUpdate(sql); 
    }   catch (Exception e) {
        e.printStackTrace();
    }
}
        public static void updateAdmin(adminbin ab)
{
    try {
        connect();
        String sql="update admin set title='"+ab.getTitle()+"',lastname='"+ab.getLname()+"',fathersname='"+ab.getFname()+"',gender='"+ab.getGender()+"',dob='"+ab.getDob()+"',contactno='"+ab.getContact()+"',maritalstatus='"+ab.getMstatus()+"',emailid='"+ab.getEmailid()+"',nationality='"+ab.getNationality()+"',state='"+ab.getState()+"',city='"+ab.getCity()+"',address='"+ab.getAddress()+"',idproof='"+ab.getIdproof()+"',idno='"+ab.getIdno()+"',password='"+ab.getPassword()+"' where firstname='"+ab.getName()+"'";
        stm.executeUpdate(sql); 
    }   catch (Exception e) {
        e.printStackTrace();
    }
}
             public static void deleteAdmin(adminbin ab)
{
    try {
        connect();
        String sql="delete from admin where firstname='"+ab.getName()+"'";
        stm.executeUpdate(sql); 
    }   catch (Exception e) {
        e.printStackTrace();
    }
}
     public static void updateCustomer(customerbin cb)
{
    try {
        connect();
        String sql="update customer set title='"+cb.getTitle()+"',lastname='"+cb.getLname()+"',fathersname='"+cb.getFname()+"',gender='"+cb.getGender()+"',dob='"+cb.getDob()+"',contactno='"+cb.getContact()+"',maritalstatus='"+cb.getMstatus()+"',emailid='"+cb.getEmail()+"',nationality='"+cb.getNationality()+"',state='"+cb.getState()+"',city='"+cb.getCity()+"',address='"+cb.getAddress()+"',idproof='"+cb.getIdproof()+"',idno='"+cb.getIdno()+"' where firstname='"+cb.getName()+"'";
        stm.executeUpdate(sql); 
    }   catch (Exception e) {
        e.printStackTrace();
    }
}
   public static void deleteCustAndRoom(roombin rb)
{
    try {
        connect();
        String sql="delete from roomdetail where customername='"+rb.getCustomername()+"'";
        stm.executeUpdate(sql); 
    }   catch (Exception e) {
        e.printStackTrace();
    }
} 
   public static void deleteCustomer(customerbin cb)
{
    try {
        connect();
        String sql="delete from customer where firstname='"+cb.getName()+"'";
        stm.executeUpdate(sql); 
    }   catch (Exception e) {
        e.printStackTrace();
    }
} 
         public static List<roombin> getAllRoomAndCust() 
 {
 
        List<roombin> us = new ArrayList<roombin>();
        try {
            connect();
            String sql;

            sql = "Select * from roomdetail ";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                roombin r = new roombin();

                r.customerid=rs.getInt("customerid");
                r.customername=rs.getString("customername");
                r.roomno1=rs.getInt("roomno1");
                r.roomno2=rs.getInt("roomno2");
                r.roomtype1=rs.getString("roomtype1");
                r.roomtype2=rs.getString("roomtype2");
                r.totalroom=rs.getInt("totalroom");
                r.amount=rs.getInt("amount");
                r.paymentoption=rs.getString("paymentoption");
                r.checkin=rs.getString("checkin");
                r.checkout=rs.getString("checkout");
                us.add(r);
            }
            rs.close();
            stm.close();
            cn.close();

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();

        } finally {
            //finally block used to close resources
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return us;
    
}
           public static List<roombin> getAllRoomAndCustById(roombin a) 
 {
 
        List<roombin> us = new ArrayList<roombin>();
        try {
            connect();
            String sql;

            sql = "Select * from roomdetail where customerid='"+a.getCustomerid()+"'";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                roombin r = new roombin();

                r.customerid=rs.getInt("customerid");
                r.customername=rs.getString("customername");
                r.roomno1=rs.getInt("roomno1");
                r.roomno2=rs.getInt("roomno2");
                r.roomtype1=rs.getString("roomtype1");
                r.roomtype2=rs.getString("roomtype2");
                r.totalroom=rs.getInt("totalroom");
                r.amount=rs.getInt("amount");
                r.paymentoption=rs.getString("paymentoption");
                r.checkin=rs.getString("checkin");
                r.checkout=rs.getString("checkout");
                us.add(r);
            }
            rs.close();
            stm.close();
            cn.close();

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();

        } finally {
            //finally block used to close resources
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return us;
    
}
         
          public static List<roombin> getAllRoomAndCustByName(roombin c) 
 {
 
        List<roombin> us = new ArrayList<roombin>();
        try {
            connect();
            String sql;

            sql = "Select * from roomdetail where customername='"+c.getCustomername()+"'";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                roombin r = new roombin();

                r.customerid=rs.getInt("customerid");
                r.customername=rs.getString("customername");
                r.roomno1=rs.getInt("roomno1");
                r.roomno2=rs.getInt("roomno2");
                r.roomtype1=rs.getString("roomtype1");
                r.roomtype2=rs.getString("roomtype2");
                r.totalroom=rs.getInt("totalroom");
                r.amount=rs.getInt("amount");
                r.paymentoption=rs.getString("paymentoption");
                r.checkin=rs.getString("checkin");
                r.checkout=rs.getString("checkout");
                us.add(r);
            }
            rs.close();
            stm.close();
            cn.close();

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();

        } finally {
            //finally block used to close resources
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return us;
    
}
          
          public static List<customerbin> getAllcustomerById(customerbin c) 
 {
 
        List<customerbin> us = new ArrayList<customerbin>();
        try {
            connect();
            String sql;

            sql = "Select * from customer where customerid='"+c.getCustomerid()+"'";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                customerbin a = new customerbin();
 
               a.title=rs.getString("title");
                a.customerid=rs.getInt("customerid");
                a.name=rs.getString("firstname");
                a.lname=rs.getString("lastname");
                a.fname=rs.getString("fathersname");
                a.gender=rs.getString("gender");
                a.dob=rs.getString("dob");
                a.contact=rs.getString("contactno");
                a.email=rs.getString("emailid");
                a.city=rs.getString("city");
               a.mstatus=rs.getString("maritalstatus");
               a.address=rs.getString("address");
               a.idproof=rs.getString("idproof");
               a.idno=rs.getString("idno");
               a.nationality=rs.getString("nationality");
               a.state=rs.getString("state");
               
                us.add(a);
            }
            rs.close();
            stm.close();
            cn.close();

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();

        } finally {
            //finally block used to close resources
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return us;
    
}
          public static List<adminbin> getAlladminByName(adminbin e) 
 {
 
        List<adminbin> us = new ArrayList<adminbin>();
        try {
            connect();
            String sql;

             sql = "Select * from admin where firstname='"+e.getName()+"'";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                adminbin a = new adminbin();
                
               a.title=rs.getString("title");
               a.adminid=rs.getInt("adminid");
               a.name=rs.getString("firstname");
               a.lname=rs.getString("lastname");
               a.fname=rs.getString("fathersname");
               a.gender=rs.getString("gender");
               a.dob=rs.getString("dob");
               a.contact=rs.getString("contactno");
               a.emailid=rs.getString("emailid");
               a.city=rs.getString("city");
               a.mstatus=rs.getString("maritalstatus");
               a.address=rs.getString("address");
               a.password=rs.getString("password");
               a.idproof=rs.getString("idproof");
               a.idno=rs.getString("idno");
               a.nationality=rs.getString("nationality");
               a.state=rs.getString("state");
               
                us.add(a);
            }
            rs.close();
            stm.close();
            cn.close();

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception ex) {
            //Handle errors for Class.forName
            ex.printStackTrace();

        } finally {
            //finally block used to close resources
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return us;
    }
          
          public static List<roombin> getAllRoomdetailByID(roombin rb)
 {
 
        List<roombin> us = new ArrayList<roombin>();
        try {
            connect();
            String sql;

            sql = "Select * from roomdetail where customerid='"+rb.getCustomerid()+"'";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                roombin r = new roombin();
 
               r.totalroom =rs.getInt("totalroom");
               r.checkin=rs.getString("checkin");
               r.checkout=rs.getString("checkout");
               r.date=rs.getString("date");
               r.paymentoption=rs.getString("paymentoption");
               r.amount=rs.getInt("amount");
               r.customerid=rs.getInt("customerid");
               r.customername=rs.getString("customername");
               r.roomtype1=rs.getString("roomtype1");
               r.roomtype2=rs.getString("roomtype2");
               r.roomno1=rs.getInt("roomno1");
               r.roomno2=rs.getInt("roomno2");
               
                us.add(r);
            }
            rs.close();
            stm.close();
            cn.close();

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();

        } finally {
            //finally block used to close resources
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return us;
    
}
          
            public static void updateroomdetail(roombin r)
{
    try {
        connect();
        String sql="update  roomdetail set checkin='"+r.getCheckin()+"',checkout='"+r.getCheckout()+"',date='"+r.getDate()+"',paymentoption='"+r.getPaymentoption()+"',amount='"+r.getAmount()+"',customerid='"+r.getCustomerid()+"',customername='"+r.getCustomername()+"' where customerid='"+r.getCustomerid()+"'";
        stm.executeUpdate(sql); 
    } catch (Exception e) {
        e.printStackTrace();
    }
}
                    
            public static void updateroomAvailable(roombin r)
{
    try {
        connect();
        String sql="update  roominsert set  availability ='NA' where roomno='"+r.getRoomno1()+"'" ;
         String sql1="update  roominsert set  availability ='NA' where roomno='"+r.getRoomno2()+"'" ;
        stm.executeUpdate(sql);
         stm.executeUpdate(sql1);
    } catch (Exception e) {
        e.printStackTrace();
    }
}  
            
         public static void updateroomNAvailable(int id)
{
    try {
        connect();
        String sql="update  roominsert set  availability ='A' where roomno='"+id+"'" ;
         String sql1="update  roominsert set  availability ='A' where roomno='"+id+"'" ;
        stm.executeUpdate(sql);
         stm.executeUpdate(sql1);
    } catch (Exception e) {
        e.printStackTrace();
    }

}
         
         public static List<roombin> getAllRoomByCustID(int id) 
 {
 
        List<roombin> us = new ArrayList<roombin>();
        try {
            connect();
            String sql;

            sql = "Select * from roomdetail where customerid='"+id+"'";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                roombin r = new roombin();
 
                r.roomno1=rs.getInt("roomno1");
                r.roomno2=rs.getInt("roomno2");
                r.customerid=rs.getInt("customerid");
                us.add(r);
            }
            rs.close();
            stm.close();
            cn.close();

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();

        } finally {
            //finally block used to close resources
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return us;
    
}
         public static void updateRoomInsert(roombin rb)
{
    try {
        connect();
        String sql="update roominsert set roomtype='"+rb.getRoomtype()+"',roomprice='"+rb.getRoomprice()+"',availability='"+rb.getAvailability()+"' where roomno='"+rb.getRoomno()+"'";
        stm.executeUpdate(sql); 
    }   catch (Exception e) {
        e.printStackTrace();
    }
}
     public static void deleteRoomInsert(roombin rb)
{
    try {
        connect();
        String sql="delete from roominsert where roomno='"+rb.getRoomno()+"'";
        stm.executeUpdate(sql); 
    }   catch (Exception e) {
        e.printStackTrace();
    }
}
}