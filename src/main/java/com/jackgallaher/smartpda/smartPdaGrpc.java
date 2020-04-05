package com.jackgallaher.smartpda;

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
    comments = "Source: pda.proto")
public final class smartPdaGrpc {

  private smartPdaGrpc() {}

  public static final String SERVICE_NAME = "smartdevice.smartPda";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jackgallaher.smartpda.Empty,
      com.jackgallaher.smartpda.PowerStatus> getSwitchOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchOn",
      requestType = com.jackgallaher.smartpda.Empty.class,
      responseType = com.jackgallaher.smartpda.PowerStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jackgallaher.smartpda.Empty,
      com.jackgallaher.smartpda.PowerStatus> getSwitchOnMethod() {
    io.grpc.MethodDescriptor<com.jackgallaher.smartpda.Empty, com.jackgallaher.smartpda.PowerStatus> getSwitchOnMethod;
    if ((getSwitchOnMethod = smartPdaGrpc.getSwitchOnMethod) == null) {
      synchronized (smartPdaGrpc.class) {
        if ((getSwitchOnMethod = smartPdaGrpc.getSwitchOnMethod) == null) {
          smartPdaGrpc.getSwitchOnMethod = getSwitchOnMethod = 
              io.grpc.MethodDescriptor.<com.jackgallaher.smartpda.Empty, com.jackgallaher.smartpda.PowerStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartdevice.smartPda", "switchOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartpda.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartpda.PowerStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new smartPdaMethodDescriptorSupplier("switchOn"))
                  .build();
          }
        }
     }
     return getSwitchOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jackgallaher.smartpda.Empty,
      com.jackgallaher.smartpda.PowerStatus> getSwitchOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchOff",
      requestType = com.jackgallaher.smartpda.Empty.class,
      responseType = com.jackgallaher.smartpda.PowerStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jackgallaher.smartpda.Empty,
      com.jackgallaher.smartpda.PowerStatus> getSwitchOffMethod() {
    io.grpc.MethodDescriptor<com.jackgallaher.smartpda.Empty, com.jackgallaher.smartpda.PowerStatus> getSwitchOffMethod;
    if ((getSwitchOffMethod = smartPdaGrpc.getSwitchOffMethod) == null) {
      synchronized (smartPdaGrpc.class) {
        if ((getSwitchOffMethod = smartPdaGrpc.getSwitchOffMethod) == null) {
          smartPdaGrpc.getSwitchOffMethod = getSwitchOffMethod = 
              io.grpc.MethodDescriptor.<com.jackgallaher.smartpda.Empty, com.jackgallaher.smartpda.PowerStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartdevice.smartPda", "switchOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartpda.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartpda.PowerStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new smartPdaMethodDescriptorSupplier("switchOff"))
                  .build();
          }
        }
     }
     return getSwitchOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jackgallaher.smartpda.Date,
      com.jackgallaher.smartpda.Appointment> getGetAppointmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAppointments",
      requestType = com.jackgallaher.smartpda.Date.class,
      responseType = com.jackgallaher.smartpda.Appointment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jackgallaher.smartpda.Date,
      com.jackgallaher.smartpda.Appointment> getGetAppointmentsMethod() {
    io.grpc.MethodDescriptor<com.jackgallaher.smartpda.Date, com.jackgallaher.smartpda.Appointment> getGetAppointmentsMethod;
    if ((getGetAppointmentsMethod = smartPdaGrpc.getGetAppointmentsMethod) == null) {
      synchronized (smartPdaGrpc.class) {
        if ((getGetAppointmentsMethod = smartPdaGrpc.getGetAppointmentsMethod) == null) {
          smartPdaGrpc.getGetAppointmentsMethod = getGetAppointmentsMethod = 
              io.grpc.MethodDescriptor.<com.jackgallaher.smartpda.Date, com.jackgallaher.smartpda.Appointment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartdevice.smartPda", "getAppointments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartpda.Date.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartpda.Appointment.getDefaultInstance()))
                  .setSchemaDescriptor(new smartPdaMethodDescriptorSupplier("getAppointments"))
                  .build();
          }
        }
     }
     return getGetAppointmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jackgallaher.smartpda.Day,
      com.jackgallaher.smartpda.ToDoList> getGetToDoListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getToDoList",
      requestType = com.jackgallaher.smartpda.Day.class,
      responseType = com.jackgallaher.smartpda.ToDoList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.jackgallaher.smartpda.Day,
      com.jackgallaher.smartpda.ToDoList> getGetToDoListMethod() {
    io.grpc.MethodDescriptor<com.jackgallaher.smartpda.Day, com.jackgallaher.smartpda.ToDoList> getGetToDoListMethod;
    if ((getGetToDoListMethod = smartPdaGrpc.getGetToDoListMethod) == null) {
      synchronized (smartPdaGrpc.class) {
        if ((getGetToDoListMethod = smartPdaGrpc.getGetToDoListMethod) == null) {
          smartPdaGrpc.getGetToDoListMethod = getGetToDoListMethod = 
              io.grpc.MethodDescriptor.<com.jackgallaher.smartpda.Day, com.jackgallaher.smartpda.ToDoList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartdevice.smartPda", "getToDoList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartpda.Day.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartpda.ToDoList.getDefaultInstance()))
                  .setSchemaDescriptor(new smartPdaMethodDescriptorSupplier("getToDoList"))
                  .build();
          }
        }
     }
     return getGetToDoListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jackgallaher.smartpda.Type,
      com.jackgallaher.smartpda.PlayableFiles> getGetMP3AndMP4FilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMP3AndMP4Files",
      requestType = com.jackgallaher.smartpda.Type.class,
      responseType = com.jackgallaher.smartpda.PlayableFiles.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jackgallaher.smartpda.Type,
      com.jackgallaher.smartpda.PlayableFiles> getGetMP3AndMP4FilesMethod() {
    io.grpc.MethodDescriptor<com.jackgallaher.smartpda.Type, com.jackgallaher.smartpda.PlayableFiles> getGetMP3AndMP4FilesMethod;
    if ((getGetMP3AndMP4FilesMethod = smartPdaGrpc.getGetMP3AndMP4FilesMethod) == null) {
      synchronized (smartPdaGrpc.class) {
        if ((getGetMP3AndMP4FilesMethod = smartPdaGrpc.getGetMP3AndMP4FilesMethod) == null) {
          smartPdaGrpc.getGetMP3AndMP4FilesMethod = getGetMP3AndMP4FilesMethod = 
              io.grpc.MethodDescriptor.<com.jackgallaher.smartpda.Type, com.jackgallaher.smartpda.PlayableFiles>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartdevice.smartPda", "getMP3AndMP4Files"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartpda.Type.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartpda.PlayableFiles.getDefaultInstance()))
                  .setSchemaDescriptor(new smartPdaMethodDescriptorSupplier("getMP3AndMP4Files"))
                  .build();
          }
        }
     }
     return getGetMP3AndMP4FilesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static smartPdaStub newStub(io.grpc.Channel channel) {
    return new smartPdaStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static smartPdaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new smartPdaBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static smartPdaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new smartPdaFutureStub(channel);
  }

  /**
   */
  public static abstract class smartPdaImplBase implements io.grpc.BindableService {

    /**
     */
    public void switchOn(com.jackgallaher.smartpda.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartpda.PowerStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchOnMethod(), responseObserver);
    }

    /**
     */
    public void switchOff(com.jackgallaher.smartpda.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartpda.PowerStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchOffMethod(), responseObserver);
    }

    /**
     */
    public void getAppointments(com.jackgallaher.smartpda.Date request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartpda.Appointment> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAppointmentsMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.jackgallaher.smartpda.Day> getToDoList(
        io.grpc.stub.StreamObserver<com.jackgallaher.smartpda.ToDoList> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetToDoListMethod(), responseObserver);
    }

    /**
     */
    public void getMP3AndMP4Files(com.jackgallaher.smartpda.Type request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartpda.PlayableFiles> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMP3AndMP4FilesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSwitchOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jackgallaher.smartpda.Empty,
                com.jackgallaher.smartpda.PowerStatus>(
                  this, METHODID_SWITCH_ON)))
          .addMethod(
            getSwitchOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jackgallaher.smartpda.Empty,
                com.jackgallaher.smartpda.PowerStatus>(
                  this, METHODID_SWITCH_OFF)))
          .addMethod(
            getGetAppointmentsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jackgallaher.smartpda.Date,
                com.jackgallaher.smartpda.Appointment>(
                  this, METHODID_GET_APPOINTMENTS)))
          .addMethod(
            getGetToDoListMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.jackgallaher.smartpda.Day,
                com.jackgallaher.smartpda.ToDoList>(
                  this, METHODID_GET_TO_DO_LIST)))
          .addMethod(
            getGetMP3AndMP4FilesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jackgallaher.smartpda.Type,
                com.jackgallaher.smartpda.PlayableFiles>(
                  this, METHODID_GET_MP3AND_MP4FILES)))
          .build();
    }
  }

  /**
   */
  public static final class smartPdaStub extends io.grpc.stub.AbstractStub<smartPdaStub> {
    private smartPdaStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartPdaStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartPdaStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartPdaStub(channel, callOptions);
    }

    /**
     */
    public void switchOn(com.jackgallaher.smartpda.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartpda.PowerStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void switchOff(com.jackgallaher.smartpda.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartpda.PowerStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAppointments(com.jackgallaher.smartpda.Date request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartpda.Appointment> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAppointmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.jackgallaher.smartpda.Day> getToDoList(
        io.grpc.stub.StreamObserver<com.jackgallaher.smartpda.ToDoList> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGetToDoListMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getMP3AndMP4Files(com.jackgallaher.smartpda.Type request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartpda.PlayableFiles> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetMP3AndMP4FilesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class smartPdaBlockingStub extends io.grpc.stub.AbstractStub<smartPdaBlockingStub> {
    private smartPdaBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartPdaBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartPdaBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartPdaBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.jackgallaher.smartpda.PowerStatus switchOn(com.jackgallaher.smartpda.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSwitchOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.jackgallaher.smartpda.PowerStatus switchOff(com.jackgallaher.smartpda.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSwitchOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.jackgallaher.smartpda.Appointment> getAppointments(
        com.jackgallaher.smartpda.Date request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAppointmentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.jackgallaher.smartpda.PlayableFiles> getMP3AndMP4Files(
        com.jackgallaher.smartpda.Type request) {
      return blockingServerStreamingCall(
          getChannel(), getGetMP3AndMP4FilesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class smartPdaFutureStub extends io.grpc.stub.AbstractStub<smartPdaFutureStub> {
    private smartPdaFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartPdaFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartPdaFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartPdaFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jackgallaher.smartpda.PowerStatus> switchOn(
        com.jackgallaher.smartpda.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jackgallaher.smartpda.PowerStatus> switchOff(
        com.jackgallaher.smartpda.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchOffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SWITCH_ON = 0;
  private static final int METHODID_SWITCH_OFF = 1;
  private static final int METHODID_GET_APPOINTMENTS = 2;
  private static final int METHODID_GET_MP3AND_MP4FILES = 3;
  private static final int METHODID_GET_TO_DO_LIST = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final smartPdaImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(smartPdaImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SWITCH_ON:
          serviceImpl.switchOn((com.jackgallaher.smartpda.Empty) request,
              (io.grpc.stub.StreamObserver<com.jackgallaher.smartpda.PowerStatus>) responseObserver);
          break;
        case METHODID_SWITCH_OFF:
          serviceImpl.switchOff((com.jackgallaher.smartpda.Empty) request,
              (io.grpc.stub.StreamObserver<com.jackgallaher.smartpda.PowerStatus>) responseObserver);
          break;
        case METHODID_GET_APPOINTMENTS:
          serviceImpl.getAppointments((com.jackgallaher.smartpda.Date) request,
              (io.grpc.stub.StreamObserver<com.jackgallaher.smartpda.Appointment>) responseObserver);
          break;
        case METHODID_GET_MP3AND_MP4FILES:
          serviceImpl.getMP3AndMP4Files((com.jackgallaher.smartpda.Type) request,
              (io.grpc.stub.StreamObserver<com.jackgallaher.smartpda.PlayableFiles>) responseObserver);
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
        case METHODID_GET_TO_DO_LIST:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getToDoList(
              (io.grpc.stub.StreamObserver<com.jackgallaher.smartpda.ToDoList>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class smartPdaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    smartPdaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jackgallaher.smartpda.SmartDevicePdaImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("smartPda");
    }
  }

  private static final class smartPdaFileDescriptorSupplier
      extends smartPdaBaseDescriptorSupplier {
    smartPdaFileDescriptorSupplier() {}
  }

  private static final class smartPdaMethodDescriptorSupplier
      extends smartPdaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    smartPdaMethodDescriptorSupplier(String methodName) {
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
      synchronized (smartPdaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new smartPdaFileDescriptorSupplier())
              .addMethod(getSwitchOnMethod())
              .addMethod(getSwitchOffMethod())
              .addMethod(getGetAppointmentsMethod())
              .addMethod(getGetToDoListMethod())
              .addMethod(getGetMP3AndMP4FilesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
