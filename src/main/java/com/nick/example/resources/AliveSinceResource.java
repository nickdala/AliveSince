package com.nick.example.resources;

import com.google.common.base.Optional;
import com.nick.example.core.AliveSince;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/AliveSince")
@Produces(MediaType.APPLICATION_JSON)
public class AliveSinceResource {
    private final int defaultBirthYear;
    private final int defaultBirthMonth;
    private final int defaultBirthDay;

    public AliveSinceResource(int defaultBirthYear, int defaultBirthMonth, int defaultBirthDay) {
        this.defaultBirthYear = defaultBirthYear;
        this.defaultBirthMonth = defaultBirthMonth;
        this.defaultBirthDay = defaultBirthDay;
    }

    @GET
    public AliveSince get(@QueryParam("birthYear") Optional<Integer> birthYear,
                          @QueryParam("birthMonth") Optional<Integer> birthMonth,
                          @QueryParam("birthDay") Optional<Integer> birthDay) {
        final int year = birthYear.or(defaultBirthYear);
        final int month = birthMonth.or(defaultBirthMonth);
        final int day = birthDay.or(defaultBirthDay);
        AliveSince aliveSince = new AliveSince(year, month, day);
        return aliveSince;
    }
}
