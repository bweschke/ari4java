package ch.loway.oss.ari4java.generated.ari_1_9_0.models;

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
 * Details of an Asterisk module
 * 
 * Defined in file: asterisk.json
 * Generated by: Model
 *********************************************************/

public class Module_impl_ari_1_9_0 implements Module, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The description of this module  */
  private String description;
 public String getDescription() {
   return description;
 }

 @JsonDeserialize( as=String.class )
 public void setDescription(String val ) {
   description = val;
 }

  /**  The name of this module  */
  private String name;
 public String getName() {
   return name;
 }

 @JsonDeserialize( as=String.class )
 public void setName(String val ) {
   name = val;
 }

  /**  The running status of this module  */
  private String status;
 public String getStatus() {
   return status;
 }

 @JsonDeserialize( as=String.class )
 public void setStatus(String val ) {
   status = val;
 }

  /**  The support state of this module  */
  private String support_level;
 public String getSupport_level() {
   return support_level;
 }

 @JsonDeserialize( as=String.class )
 public void setSupport_level(String val ) {
   support_level = val;
 }

  /**  The number of times this module is being used  */
  private int use_count;
 public int getUse_count() {
   return use_count;
 }

 @JsonDeserialize( as=int.class )
 public void setUse_count(int val ) {
   use_count = val;
 }

/** No missing signatures from interface */
}

