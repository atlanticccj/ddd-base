package org.mvnsearch.ddd.domain;

import org.mvnsearch.ddd.domain.annotations.DomainEvent;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * base domain event
 *
 * @author linux_china
 */
@DomainEvent
public class BaseDomainEvent<T> implements Serializable {
    protected Map<String, Object> context = new HashMap<String, Object>();
    protected T source;

    public BaseDomainEvent() {

    }

    public BaseDomainEvent(T source) {
        this.source = source;
    }

    public T getSource() {
        return source;
    }

    public void setSource(T source) {
        this.source = source;
    }

    public Object getAttribute(String name) {
        return context.get(name);
    }

    public void setAttribute(String name, Object value) {
        this.context.put(name, value);
    }
}
