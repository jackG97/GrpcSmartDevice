// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pda.proto

package com.jackgallaher.smartpda;

public final class SmartDevicePdaImpl {
  private SmartDevicePdaImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartdevice_PowerStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartdevice_PowerStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartdevice_Date_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartdevice_Date_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartdevice_Appointment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartdevice_Appointment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartdevice_Day_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartdevice_Day_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartdevice_ToDoList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartdevice_ToDoList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartdevice_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartdevice_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartdevice_Type_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartdevice_Type_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartdevice_PlayableFiles_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartdevice_PlayableFiles_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tpda.proto\022\013smartdevice\"\035\n\013PowerStatus\022" +
      "\016\n\006status\030\001 \001(\010\"\024\n\004Date\022\014\n\004date\030\001 \001(\t\"F\n" +
      "\013Appointment\022\r\n\005title\030\001 \001(\t\022\014\n\004note\030\002 \001(" +
      "\t\022\014\n\004time\030\003 \001(\t\022\014\n\004date\030\004 \001(\t\"\022\n\003Day\022\013\n\003" +
      "day\030\001 \001(\t\"%\n\010ToDoList\022\013\n\003day\030\001 \001(\t\022\014\n\004to" +
      "do\030\002 \001(\t\"\007\n\005Empty\"\024\n\004Type\022\014\n\004type\030\002 \001(\t\"" +
      "/\n\rPlayableFiles\022\020\n\010filename\030\001 \001(\t\022\014\n\004ty" +
      "pe\030\002 \001(\t2\315\002\n\010smartPda\022:\n\010switchOn\022\022.smar" +
      "tdevice.Empty\032\030.smartdevice.PowerStatus\"" +
      "\000\022;\n\tswitchOff\022\022.smartdevice.Empty\032\030.sma" +
      "rtdevice.PowerStatus\"\000\022B\n\017getAppointment" +
      "s\022\021.smartdevice.Date\032\030.smartdevice.Appoi" +
      "ntment\"\0000\001\022<\n\013getToDoList\022\020.smartdevice." +
      "Day\032\025.smartdevice.ToDoList\"\000(\0010\001\022F\n\021getM" +
      "P3AndMP4Files\022\021.smartdevice.Type\032\032.smart" +
      "device.PlayableFiles\"\0000\001B1\n\031com.jackgall" +
      "aher.smartpdaB\022SmartDevicePdaImplP\001b\006pro" +
      "to3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_smartdevice_PowerStatus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_smartdevice_PowerStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartdevice_PowerStatus_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_smartdevice_Date_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_smartdevice_Date_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartdevice_Date_descriptor,
        new java.lang.String[] { "Date", });
    internal_static_smartdevice_Appointment_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_smartdevice_Appointment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartdevice_Appointment_descriptor,
        new java.lang.String[] { "Title", "Note", "Time", "Date", });
    internal_static_smartdevice_Day_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_smartdevice_Day_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartdevice_Day_descriptor,
        new java.lang.String[] { "Day", });
    internal_static_smartdevice_ToDoList_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_smartdevice_ToDoList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartdevice_ToDoList_descriptor,
        new java.lang.String[] { "Day", "Todo", });
    internal_static_smartdevice_Empty_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_smartdevice_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartdevice_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_smartdevice_Type_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_smartdevice_Type_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartdevice_Type_descriptor,
        new java.lang.String[] { "Type", });
    internal_static_smartdevice_PlayableFiles_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_smartdevice_PlayableFiles_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartdevice_PlayableFiles_descriptor,
        new java.lang.String[] { "Filename", "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
