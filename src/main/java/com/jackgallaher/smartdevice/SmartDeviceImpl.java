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

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013phone.proto\022\013smartdevice\032\033google/proto" +
      "buf/empty.proto\"\035\n\013PowerStatus\022\016\n\006status" +
      "\030\001 \001(\010\"9\n\010Contacts\022\014\n\004name\030\001 \001(\t\022\016\n\006numb" +
      "er\030\002 \001(\t\022\017\n\007network\030\003 \001(\t\"\030\n\010Response\022\014\n" +
      "\004text\030\001 \001(\t2\216\002\n\nsmartPhone\022>\n\010switchOn\022\026" +
      ".google.protobuf.Empty\032\030.smartdevice.Pow" +
      "erStatus\"\000\022?\n\tswitchOff\022\026.google.protobu" +
      "f.Empty\032\030.smartdevice.PowerStatus\"\000\022A\n\014f" +
      "indContacts\022\026.google.protobuf.Empty\032\025.sm" +
      "artdevice.Contacts\"\0000\001\022<\n\naddContact\022\025.s" +
      "martdevice.Contacts\032\025.smartdevice.Respon" +
      "se\"\000B1\n\034com.jackgallaher.smartdeviceB\017Sm" +
      "artDeviceImplP\001b\006proto3"
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
          com.google.protobuf.EmptyProto.getDescriptor(),
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
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}