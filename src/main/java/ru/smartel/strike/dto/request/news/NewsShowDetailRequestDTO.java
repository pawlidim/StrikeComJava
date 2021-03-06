package ru.smartel.strike.dto.request.news;


import ru.smartel.strike.service.Locale;

/**
 * dto for detail view request
 */
public class NewsShowDetailRequestDTO {
    private Locale locale;
    private long id;

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
