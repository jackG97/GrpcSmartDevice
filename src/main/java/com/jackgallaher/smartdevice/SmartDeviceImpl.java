// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: phone.proto

package com.jackgallaher.smartdevice;

public final class SmartDeviceImpl {
  private SmartDeviceImpl() {}
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
    internal_static_smartdevice_Contacts_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartdevice_Contacts_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartdevice_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartdevice_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartdevice_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartdevice_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013phone.proto\022\013smartdevice\"\035\n\013PowerStatu" +
      "s\022\016\n\006status\030\001 \001(\010\"9\n\010Contacts\022\014\n\004name\030\001 " +
      "\001(\t\022\016\n\006number\030\002 \001(\t\022\017\n\007network\030\003 \001(\t\"\030\n\010" +
      "Response\022\014\n\004text\030\001 \001(\t\"\007\n\005Empty2\202\002\n\nsmar" +
      "tPhone\022:\n\010switchOn\022\022.smartdevice.Empty\032\030" +
      ".smartdevice.PowerStatus\"\000\022;\n\tswitchOff\022" +
      "\022.smartdevice.Empty\032\030.smartdevice.PowerS" +
      "tatus\"\000\022=\n\014findContacts\022\022.smartdevice.Em" +
      "pty\032\025.smartdevice.Contacts\"\0000\001\022<\n\naddCon" +
      "tact\022\025.smartdevice.Contacts\032\025.smartdevic" +
      "e.Response\"\000B1\n\034com.jackgallaher.smartde" +
      "viceB\017SmartDeviceImplP\001b\006proto3"
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
    internal_static_smartdevice_Contacts_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_smartdevice_Contacts_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartdevice_Contacts_descriptor,
        new java.lang.String[] { "Name", "Number", "Network", });
    internal_static_smartdevice_Response_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_smartdevice_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartdevice_Response_descriptor,
        new java.lang.String[] { "Text", });
    internal_static_smartdevice_Empty_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_smartdevice_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartdevice_Empty_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
