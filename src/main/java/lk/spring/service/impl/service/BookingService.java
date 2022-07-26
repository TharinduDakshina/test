package lk.spring.service.impl.service;

import lk.spring.service.impl.dto.BookingDTO;

import java.util.List;

public interface BookingService {
    void saveBooking(BookingDTO dto);
    void updateBooking(BookingDTO dto);
    void deleteBooking(String id);
    BookingDTO searchBooking(String id);
    List<BookingDTO> getAllBooking();
    BookingDTO findLastBookingById();
}
