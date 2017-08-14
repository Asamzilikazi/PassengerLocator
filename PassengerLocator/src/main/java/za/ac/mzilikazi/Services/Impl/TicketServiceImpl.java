package za.ac.mzilikazi.Services.Impl;

import za.ac.mzilikazi.Domain.Ticket;
import za.ac.mzilikazi.Repository.Impl.TicketRepositoryImpl;

/**
 * Created by Asavela on 2017/08/10.
 */
public class TicketServiceImpl {
    public static TicketServiceImpl ticketService = null;

    TicketRepositoryImpl ticketRepository = TicketRepositoryImpl.getInstance();

    public static TicketServiceImpl getInstance()
    {
        if (ticketService == null)
            ticketService = new TicketServiceImpl();
        return ticketService;
    }

    public Ticket create(Ticket ticket){
        return ticketRepository.create(ticket);    }

    public Ticket read(String ticketingCode){
        return ticketRepository.read(ticketingCode);    }

    public Ticket update(Ticket ticket){
        return ticketRepository.update(ticket);    }

    public void delete(String ticketingCode)
    {
        ticketRepository.delete(ticketingCode);
    }

}
