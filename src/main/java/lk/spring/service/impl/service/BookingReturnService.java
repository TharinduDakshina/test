package lk.spring.service.impl.service;

import lk.spring.service.impl.dto.BookingReturnDTO;

import java.util.List;

public interface BookingReturnService {
    void saveBookingReturn(BookingReturnDTO dto);
    void updateBookingReturn(BookingReturnDTO dto);
    void deleteBookingReturn(String id);
    BookingReturnDTO searchBookingReturn(String id);
    List<BookingReturnDTO> getAllBookingReturns();
}
