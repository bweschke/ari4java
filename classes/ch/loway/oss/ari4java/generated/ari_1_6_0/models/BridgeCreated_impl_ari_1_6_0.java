package ch.loway.oss.ari4java.generated.ari_1_6_0.models;

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
 * Notification that a bridge has been created.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class BridgeCreated_impl_ari_1_6_0 extends Event_impl_ari_1_6_0 implements BridgeCreated, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private Bridge bridge;
 public Bridge getBridge() {
   return bridge;
 }

 @JsonDeserialize( as=Bridge_impl_ari_1_6_0.class )
 public void setBridge(Bridge val ) {
   bridge = val;
 }

/** No missing signatures from interface */
}

