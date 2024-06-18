package com.example.findfreelance.domains.booking;

import com.example.findfreelance.domains.entreprise.Entreprise;
import com.example.findfreelance.domains.entreprise.EntrepriseRepository;
import com.example.findfreelance.domains.freelance.Freelance;
import com.example.findfreelance.domains.freelance.FreelanceRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class BookingService {

    private final FreelanceRepository FreelanceRepository;
    private final BookingRepository BookingRepository;
    private final EntrepriseRepository EntrepriseRepository;


    public Booking addBooking (Booking booking) {
        return BookingRepository.save(booking);
    }

    public List<Booking> getAllBookings() {
        return BookingRepository.findAll();
    }

    public void deleteBooking(Long id) {
        BookingRepository.deleteById(id);
    }
}
