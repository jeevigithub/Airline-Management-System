/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airplane.logic;

import java.sql.*;

/**
 *
 * @author gvpal
 */
public class Airline {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Airline() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/airline", "root", "root");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean register(String name, String email, String mobile, String pass) {

        try {
            ps = con.prepareStatement("insert into register(name,email,mobile,pass) values(?,?,?,?)");
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, mobile);
            ps.setString(4, pass);

            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public boolean login(String name, String pass) {
        try {
            ps = con.prepareStatement("select * from register where name=? and pass=?");
            ps.setString(1, name);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public ResultSet viewdatatb() {
        try {
            ps = con.prepareStatement("select*from main");
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        return rs;
    }

    public boolean payment(String name, String card, String amount) {

        try {
            ps = con.prepareStatement("insert into payment(name,card,amount) values(?,?,?)");
            ps.setString(1, name);
            ps.setString(2, card);
            ps.setString(3, amount);

            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public ResultSet viewdatat() {
        try {
            ps = con.prepareStatement("select*from gdetails");
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        return rs;
    }

    public boolean booking(String name, String currpl, String despl, String pno, String ddate, String dtime, String rdate, String seatno) {

        try {
            ps = con.prepareStatement("insert into booking(name,currpl,despl,pno,ddate,dtime,rdate,seatno) values(?,?,?,?,?,?,?,?)");
            ps.setString(1, name);
            ps.setString(2, currpl);
            ps.setString(3, despl);
            ps.setString(4, pno);
            ps.setString(5, ddate);
            ps.setString(6, dtime);
            ps.setString(7, ddate);
            ps.setString(8, seatno);

            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public ResultSet view() {
        try {
            ps = con.prepareStatement("select*from booking");
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        return rs;
    }

    public ResultSet paymentbill() {
        try {
            ps = con.prepareStatement("select*from payment");
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        return rs;
    }

    public boolean book(String pname, String date, String gname, String dplace) {

        try {
            ps = con.prepareStatement("insert into bookreport(pname,date,gname,dplace) values(?,?,?,?)");
            ps.setString(1, pname);
            ps.setString(2, date);
            ps.setString(3, gname);
            ps.setString(4, dplace);
            //  ps.setString(4, ddate);
            // ps.setString(5, rdate);

            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public ResultSet result() {
        try {
            ps = con.prepareStatement("select*from bookreport");
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        return rs;
    }

    public ResultSet booked() {
        try {
            ps = con.prepareStatement("select*from booking");
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        return rs;
    }

    public ResultSet prebook() {
        try {
            ps = con.prepareStatement("select*from main");
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        return rs;
    }

    public ResultSet gbooked() {
        try {
            ps = con.prepareStatement("select*from gdetails");
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        return rs;
    }

    public boolean gname(String place, String guideid, String guidename, String availabledate) {

        try {
            ps = con.prepareStatement("insert into gdetails(place,guideid,guidename,availabledate) values(?,?,?,?)");
            ps.setString(1, place);
            ps.setString(2, guideid);
            ps.setString(3, guidename);
            ps.setString(4, availabledate);

            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public boolean gnamed(String guideid) {

        try {
            ps = con.prepareStatement("delete from gdetails where guideid=?");
            // ps.setString(1, place);
            ps.setString(1, guideid);
            //  ps.setString(3, availabledate);

            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public boolean deltbl() {

        try {
            ps = con.prepareStatement("delete from booking ");
            // ps.setString(1, place);
            // ps.setString(1, guidename);
            //  ps.setString(3, availabledate);

            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public boolean del() {

        try {
            ps = con.prepareStatement("delete from bookreport ");
            // ps.setString(1, place);
            // ps.setString(1, guidename);
            //  ps.setString(3, availabledate);

            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public boolean plup(String planeno, String planename, String despl, String ddate, String dtime) {

        try {
            ps = con.prepareStatement("insert into main(pno,pname,dplace,ddate,dtime) values(?,?,?,?,?)");
            ps.setString(1, planeno);
            ps.setString(2, planename);
            ps.setString(3, despl);
            ps.setString(4, ddate);
            ps.setString(5, dtime);
            // ps.setString(6, rtime);

            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public boolean plupd(String pno) {

        try {
            ps = con.prepareStatement("delete from main where pno=?");
            // ps.setString(1, place);
            ps.setString(1, pno);
            //  ps.setString(3, availabledate);

            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public ResultSet viewamount() {
        try {
            ps = con.prepareStatement("select*from bill");
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        return rs;
    }

    public boolean aa(String pid, String amount) {

        try {
            ps = con.prepareStatement("insert into bill(pid,amount) values(?,?)");
            ps.setString(1, pid);
            ps.setString(2, amount);

            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public boolean bb(String pid) {

        try {
            ps = con.prepareStatement("delete from bill where pid=?");
            // ps.setString(1, place);
            ps.setString(1, pid);
            //  ps.setString(3, availabledate);

            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

}
