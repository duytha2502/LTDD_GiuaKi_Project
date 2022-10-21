package com.example.ltdd_giuaki_project;


public class LapTop {

    private String laptopName;

    // Image name (Without extension)
    private String giaCu, giaKM;
    private int laptop;

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public String getGiaCu() {
        return giaCu;
    }

    public void setGiaCu(String giaCu) {
        this.giaCu = giaCu;
    }

    public String getGiaKM() {
        return giaKM;
    }

    public void setGiaKM(String giaKM) {
        this.giaKM = giaKM;
    }

    public int getLaptop() {
        return laptop;
    }

    public void setLaptop(int laptop) {
        this.laptop = laptop;
    }

    public LapTop(String laptopName, int laptop, String giaCu, String giaKM) {
        this.laptopName = laptopName;
        this.laptop = laptop;
        this.giaCu = giaCu;
        this.giaKM = giaKM;


    }
}


