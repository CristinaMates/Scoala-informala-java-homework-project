import org.junit.Assert;
import org.junit.Test;
import ro.siit.evprogram.ElectricVehicleCSVReader;
import ro.siit.evprogram.ElectricVehicleCSVWriter;

import java.io.IOException;


public class ElectricVehicleCSVTest {

    @Test
    public void writeCSV() throws IOException {
        String output = "test.csv";
        ElectricVehicleCSVWriter writeList = new ElectricVehicleCSVWriter();
        writeList.writeEVCSV(output);

        String expect = "manufacturer,model,fastCharging,electricMotor,electricBattery,energyConsumption,productionYear,rangePerCharge,horsePower,stock,price\n" +
                "Volkswagen,e-UP,true,bldc,Nicd,30 KWh,2012,100,140,3,25000\n" +
                "Volkswagen,e-Golf,false,dc,vrla,32 KWh,2014,150,110,5,38000\n" +
                "Renault,Zoe,false,ac,li-ion,35 KWh,2016,130,140,2,33000\n" +
                "BMW,i3,true,bldc,vrla,37 KWh,2016,160,155,1,40000\n" +
                "Smart,FourTwo,true,bldc,vrla,28 KWh,2013,110,130,6,22000\n" +
                "Smart,FourFour,true,ac,NiCd,30 KWh,2017,90,115,0,22700\n" +
                "Smart,FourTwo Cabrio,false,bldc,li-ion,42 KWh,2016,180,120,10,23000\n" +
                "Kia,Soul,true,dc,NiCd,40 KWh,2015,125,90,8,34000\n" +
                "Hyundai,Ioniq,true,dc,vrla,34 KWh,2011,145,100,0,27000\n";

        Assert.assertEquals(output, expect);
    }

    @Test
    public void readTest() throws IOException {
        String output = "test.csv";
        ElectricVehicleCSVReader read = new ElectricVehicleCSVReader();
        read.readEVCSV(output);
        String expect = "manufacturer,model,fastCharging,electricMotor,electricBattery,energyConsumption,productionYear,rangePerCharge,horsePower,stock,price\n" +
                "Volkswagen,e-UP,true,bldc,Nicd,30 KWh,2012,100,140,3,25000\n" +
                "Volkswagen,e-Golf,false,dc,vrla,32 KWh,2014,150,110,5,38000\n" +
                "Renault,Zoe,false,ac,li-ion,35 KWh,2016,130,140,2,33000\n" +
                "BMW,i3,true,bldc,vrla,37 KWh,2016,160,155,1,40000\n" +
                "Smart,FourTwo,true,bldc,vrla,28 KWh,2013,110,130,6,22000\n" +
                "Smart,FourFour,true,ac,NiCd,30 KWh,2017,90,115,0,22700\n" +
                "Smart,FourTwo Cabrio,false,bldc,li-ion,42 KWh,2016,180,120,10,23000\n" +
                "Kia,Soul,true,dc,NiCd,40 KWh,2015,125,90,8,34000\n" +
                "Hyundai,Ioniq,true,dc,vrla,34 KWh,2011,145,100,0,27000\n";

        Assert.assertEquals(expect, output);
    }
}
