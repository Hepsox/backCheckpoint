package com.example.findfreelance.domains.booking;

import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@RestController
@RequestMapping("/booking")

public class BookingController {

    private final BookingService service;

    @PostMapping("/add")
    public Booking addBooking(@RequestBody Booking booking) {
        return service.addBooking(booking);
    }

    @GetMapping("/get/all")
    public List<Booking> getAllBookings() {
        return service.getAllBookings();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBooking(@PathVariable Long id) {
        service.deleteBooking(id);
    }


}
