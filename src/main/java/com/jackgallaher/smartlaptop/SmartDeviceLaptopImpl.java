// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: laptop.proto

package com.jackgallaher.smartlaptop;

public final class SmartDeviceLaptopImpl {
  private SmartDeviceLaptopImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartdevice_Status_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartdevice_Status_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartdevice_PowerStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartdevice_PowerStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014laptop.proto\022\013smartdevice\032\033google/prot" +
      "obuf/empty.proto\"\030\n\006Status\022\016\n\006status\030\001 \001" +
      "(\010\"E\n\013PowerStatus\022\016\n\006status\030\001 \001(\010\022\021\n\tsta" +
      "tusMsg\030\002 \001(\t\022\023\n\013batterylife\030\003 \001(\0052\217\002\n\013sm" +
      "artLaptop\0229\n\010switchOn\022\026.google.protobuf." +
      "Empty\032\023.smartdevice.Status\"\000\022:\n\tswitchOf" +
      "f\022\026.google.protobuf.Empty\032\023.smartdevice." +
      "Status\"\000\022E\n\rstartCharging\022\026.google.proto" +
      "buf.Empty\032\030.smartdevice.PowerStatus\"\0000\001\022" +
      "B\n\014laptopStatus\022\026.google.protobuf.Empty\032" +
      "\030.smartdevice.PowerStatus\"\000B7\n\034com.jackg" +
      "allaher.smartlaptopB\025SmartDeviceLaptopIm" +
      "plP\001b\006proto3"
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
    internal_static_smartdevice_Status_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_smartdevice_Status_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartdevice_Status_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_smartdevice_PowerStatus_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_smartdevice_PowerStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartdevice_PowerStatus_descriptor,
        new java.lang.String[] { "Status", "StatusMsg", "Batterylife", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
