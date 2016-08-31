package ch.loway.oss.ari4java.generated.ari_1_7_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 31 18:05:10 CEST 2016
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * Base type for asynchronous events from Asterisk.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class Event_impl_ari_1_7_0 extends Message_impl_ari_1_7_0 implements Event, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Name of the application receiving the event.  */
  private String application;
 public String getApplication() {
   return application;
 }

 @JsonDeserialize( as=String.class )
 public void setApplication(String val ) {
   application = val;
 }

  /**  Time at which this event was created.  */
  private Date timestamp;
 public Date getTimestamp() {
   return timestamp;
 }

 @JsonDeserialize( as=Date.class )
 public void setTimestamp(Date val ) {
   timestamp = val;
 }

/** No missing signatures from interface */
}

