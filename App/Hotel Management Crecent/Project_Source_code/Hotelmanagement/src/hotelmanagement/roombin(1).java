/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

/**
 *
 * @author Ghost Protocol
 */
public class roombin 
{
  int roominsertid,roomdetailid,roomno,totalroom,roomprice,amount,customerid,roomno1,roomno2;
  String roomtype,availability,checkin,checkout,date,paymentoption,customername,roomtype1,roomtype2;

    public roombin() {
    }

    public int getCustomerid() {
        return customerid;
    }

    public int getRoomno1() {
        return roomno1;
    }

    public void setRoomno1(int roomno1) {
        this.roomno1 = roomno1;
    }

    public int getRoomno2() {
        return roomno2;
    }

    public void setRoomno2(int roomno2) {
        this.roomno2 = roomno2;
    }

    public String getRoomtype1() {
        return roomtype1;
    }

    public void setRoomtype1(String roomtype1) {
        this.roomtype1 = roomtype1;
    }

    public String getRoomtype2() {
        return roomtype2;
    }

    public void setRoomtype2(String roomtype2) {
        this.roomtype2 = roomtype2;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public int getRoominsertid() {
        return roominsertid;
    }

    public void setRoominsertid(int roominsertid) {
        this.roominsertid = roominsertid;
    }

    public int getRoomdetailid() {
        return roomdetailid;
    }

    public void setRoomdetailid(int roomdetailid) {
        this.roomdetailid = roomdetailid;
    }

    public int getRoomno() {
        return roomno;
    }

    public void setRoomno(int roomno) {
        this.roomno = roomno;
    }

    public int getTotalroom() {
        return totalroom;
    }

    public void setTotalroom(int totalroom) {
        this.totalroom = totalroom;
    }

    public int getRoomprice() {
        return roomprice;
    }

    public void setRoomprice(int roomprice) {
        this.roomprice = roomprice;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPaymentoption() {
        return paymentoption;
    }

    public void setPaymentoption(String paymentoption) {
        this.paymentoption = paymentoption;
    }
  
  
}

