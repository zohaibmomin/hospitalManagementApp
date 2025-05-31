package com.example.hmsapp.service;

import com.example.hmsapp.model.Bill;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class BillService {

    public List<Bill> getAllBills() {
        System.out.println("Service Layer :: Fetching all bills..");
        return null;
    }

    public Bill getBill(Long id) {
        System.out.println("Service Layer :: Fetch a bill - " + id);
        return null;
    }

    public Bill createBill(Bill bill) {
        System.out.println("Service Layer :: Creating bill for " + bill);
        return bill;
    }

    public void updateBill(Long id) {
        System.out.println("Service Layer :: Update bill " + id);
    }

    public void deleteBill(Long id) {
        System.out.println("Service Layer :: Delete bill " + id);
    }
}
