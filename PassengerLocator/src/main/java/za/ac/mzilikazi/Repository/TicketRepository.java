package za.ac.mzilikazi.Repository;

import za.ac.mzilikazi.Domain.Ticket;

/**
 * Created by Asavela on 2017/08/10.
 */
public interface TicketRepository {
    Ticket create(Ticket luggage);
    Ticket read (String ticketingCode);
    Ticket update(Ticket luggage);
    void delete(String ticketingCode);
}
