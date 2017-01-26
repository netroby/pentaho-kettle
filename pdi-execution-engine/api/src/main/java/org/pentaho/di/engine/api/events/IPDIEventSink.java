package org.pentaho.di.engine.api.events;

/**
 * Created by nbaker on 1/7/17.
 */
public interface IPDIEventSink<T extends IDataEvent> {
  void subscribeTo( IPDIEventSource<T> source );
}