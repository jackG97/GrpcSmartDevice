package com.jackgallaher.smartdevice;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: phone.proto")
public final class smartPhoneGrpc {

  private smartPhoneGrpc() {}

  public static final String SERVICE_NAME = "smartdevice.smartPhone";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.jackgallaher.smartdevice.PowerStatus> getSwitchOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchOn",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.jackgallaher.smartdevice.PowerStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.jackgallaher.smartdevice.PowerStatus> getSwitchOnMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.jackgallaher.smartdevice.PowerStatus> getSwitchOnMethod;
    if ((getSwitchOnMethod = smartPhoneGrpc.getSwitchOnMethod) == null) {
      synchronized (smartPhoneGrpc.class) {
        if ((getSwitchOnMethod = smartPhoneGrpc.getSwitchOnMethod) == null) {
          smartPhoneGrpc.getSwitchOnMethod = getSwitchOnMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.jackgallaher.smartdevice.PowerStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartdevice.smartPhone", "switchOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartdevice.PowerStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new smartPhoneMethodDescriptorSupplier("switchOn"))
                  .build();
          }
        }
     }
     return getSwitchOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.jackgallaher.smartdevice.PowerStatus> getSwitchOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchOff",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.jackgallaher.smartdevice.PowerStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.jackgallaher.smartdevice.PowerStatus> getSwitchOffMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.jackgallaher.smartdevice.PowerStatus> getSwitchOffMethod;
    if ((getSwitchOffMethod = smartPhoneGrpc.getSwitchOffMethod) == null) {
      synchronized (smartPhoneGrpc.class) {
        if ((getSwitchOffMethod = smartPhoneGrpc.getSwitchOffMethod) == null) {
          smartPhoneGrpc.getSwitchOffMethod = getSwitchOffMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.jackgallaher.smartdevice.PowerStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartdevice.smartPhone", "switchOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartdevice.PowerStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new smartPhoneMethodDescriptorSupplier("switchOff"))
                  .build();
          }
        }
     }
     return getSwitchOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.jackgallaher.smartdevice.Contacts> getFindContactsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findContacts",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.jackgallaher.smartdevice.Contacts.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.jackgallaher.smartdevice.Contacts> getFindContactsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.jackgallaher.smartdevice.Contacts> getFindContactsMethod;
    if ((getFindContactsMethod = smartPhoneGrpc.getFindContactsMethod) == null) {
      synchronized (smartPhoneGrpc.class) {
        if ((getFindContactsMethod = smartPhoneGrpc.getFindContactsMethod) == null) {
          smartPhoneGrpc.getFindContactsMethod = getFindContactsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.jackgallaher.smartdevice.Contacts>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartdevice.smartPhone", "findContacts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartdevice.Contacts.getDefaultInstance()))
                  .setSchemaDescriptor(new smartPhoneMethodDescriptorSupplier("findContacts"))
                  .build();
          }
        }
     }
     return getFindContactsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jackgallaher.smartdevice.Contacts,
      com.jackgallaher.smartdevice.Response> getAddContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addContact",
      requestType = com.jackgallaher.smartdevice.Contacts.class,
      responseType = com.jackgallaher.smartdevice.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jackgallaher.smartdevice.Contacts,
      com.jackgallaher.smartdevice.Response> getAddContactMethod() {
    io.grpc.MethodDescriptor<com.jackgallaher.smartdevice.Contacts, com.jackgallaher.smartdevice.Response> getAddContactMethod;
    if ((getAddContactMethod = smartPhoneGrpc.getAddContactMethod) == null) {
      synchronized (smartPhoneGrpc.class) {
        if ((getAddContactMethod = smartPhoneGrpc.getAddContactMethod) == null) {
          smartPhoneGrpc.getAddContactMethod = getAddContactMethod = 
              io.grpc.MethodDescriptor.<com.jackgallaher.smartdevice.Contacts, com.jackgallaher.smartdevice.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartdevice.smartPhone", "addContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartdevice.Contacts.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartdevice.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new smartPhoneMethodDescriptorSupplier("addContact"))
                  .build();
          }
        }
     }
     return getAddContactMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static smartPhoneStub newStub(io.grpc.Channel channel) {
    return new smartPhoneStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static smartPhoneBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new smartPhoneBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static smartPhoneFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new smartPhoneFutureStub(channel);
  }

  /**
   */
  public static abstract class smartPhoneImplBase implements io.grpc.BindableService {

    /**
     */
    public void switchOn(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartdevice.PowerStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchOnMethod(), responseObserver);
    }

    /**
     */
    public void switchOff(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartdevice.PowerStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchOffMethod(), responseObserver);
    }

    /**
     */
    public void findContacts(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartdevice.Contacts> responseObserver) {
      asyncUnimplementedUnaryCall(getFindContactsMethod(), responseObserver);
    }

    /**
     */
    public void addContact(com.jackgallaher.smartdevice.Contacts request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartdevice.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getAddContactMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSwitchOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.jackgallaher.smartdevice.PowerStatus>(
                  this, METHODID_SWITCH_ON)))
          .addMethod(
            getSwitchOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.jackgallaher.smartdevice.PowerStatus>(
                  this, METHODID_SWITCH_OFF)))
          .addMethod(
            getFindContactsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.jackgallaher.smartdevice.Contacts>(
                  this, METHODID_FIND_CONTACTS)))
          .addMethod(
            getAddContactMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jackgallaher.smartdevice.Contacts,
                com.jackgallaher.smartdevice.Response>(
                  this, METHODID_ADD_CONTACT)))
          .build();
    }
  }

  /**
   */
  public static final class smartPhoneStub extends io.grpc.stub.AbstractStub<smartPhoneStub> {
    private smartPhoneStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartPhoneStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartPhoneStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartPhoneStub(channel, callOptions);
    }

    /**
     */
    public void switchOn(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartdevice.PowerStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void switchOff(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartdevice.PowerStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findContacts(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartdevice.Contacts> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFindContactsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addContact(com.jackgallaher.smartdevice.Contacts request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartdevice.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddContactMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class smartPhoneBlockingStub extends io.grpc.stub.AbstractStub<smartPhoneBlockingStub> {
    private smartPhoneBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartPhoneBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartPhoneBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartPhoneBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.jackgallaher.smartdevice.PowerStatus switchOn(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSwitchOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.jackgallaher.smartdevice.PowerStatus switchOff(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSwitchOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.jackgallaher.smartdevice.Contacts> findContacts(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getFindContactsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.jackgallaher.smartdevice.Response addContact(com.jackgallaher.smartdevice.Contacts request) {
      return blockingUnaryCall(
          getChannel(), getAddContactMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class smartPhoneFutureStub extends io.grpc.stub.AbstractStub<smartPhoneFutureStub> {
    private smartPhoneFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartPhoneFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartPhoneFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartPhoneFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jackgallaher.smartdevice.PowerStatus> switchOn(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jackgallaher.smartdevice.PowerStatus> switchOff(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jackgallaher.smartdevice.Response> addContact(
        com.jackgallaher.smartdevice.Contacts request) {
      return futureUnaryCall(
          getChannel().newCall(getAddContactMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SWITCH_ON = 0;
  private static final int METHODID_SWITCH_OFF = 1;
  private static final int METHODID_FIND_CONTACTS = 2;
  private static final int METHODID_ADD_CONTACT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final smartPhoneImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(smartPhoneImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SWITCH_ON:
          serviceImpl.switchOn((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.jackgallaher.smartdevice.PowerStatus>) responseObserver);
          break;
        case METHODID_SWITCH_OFF:
          serviceImpl.switchOff((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.jackgallaher.smartdevice.PowerStatus>) responseObserver);
          break;
        case METHODID_FIND_CONTACTS:
          serviceImpl.findContacts((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.jackgallaher.smartdevice.Contacts>) responseObserver);
          break;
        case METHODID_ADD_CONTACT:
          serviceImpl.addContact((com.jackgallaher.smartdevice.Contacts) request,
              (io.grpc.stub.StreamObserver<com.jackgallaher.smartdevice.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class smartPhoneBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    smartPhoneBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jackgallaher.smartdevice.SmartDeviceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("smartPhone");
    }
  }

  private static final class smartPhoneFileDescriptorSupplier
      extends smartPhoneBaseDescriptorSupplier {
    smartPhoneFileDescriptorSupplier() {}
  }

  private static final class smartPhoneMethodDescriptorSupplier
      extends smartPhoneBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    smartPhoneMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (smartPhoneGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new smartPhoneFileDescriptorSupplier())
              .addMethod(getSwitchOnMethod())
              .addMethod(getSwitchOffMethod())
              .addMethod(getFindContactsMethod())
              .addMethod(getAddContactMethod())
              .build();
        }
      }
    }
    return result;
  }
}
