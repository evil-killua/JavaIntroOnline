package task5.view;

import task5.bean.TravelVoucher;

import java.util.List;

public class TravelView {
    public void printAllTravel(List<TravelVoucher> travelVouchers) {
        for (TravelVoucher travelVoucher : travelVouchers) {
            System.out.println(travelVoucher.toString());
        }
    }

    public void selected_type_of_travel(TravelVoucher travelVoucher) {
        System.out.println(travelVoucher.toString());
    }

}
