package com.jackgallaher.smartprojectors;

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
    comments = "Source: projectors.proto")
public final class smartProjectorsGrpc {

  private smartProjectorsGrpc() {}

  public static final String SERVICE_NAME = "com.jackgallaher.smartprojectors.smartProjectors";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jackgallaher.smartprojectors.Projectors.Empty,
      com.jackgallaher.smartprojectors.Projectors.PowerStatus> getSwitchOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchOn",
      requestType = com.jackgallaher.smartprojectors.Projectors.Empty.class,
      responseType = com.jackgallaher.smartprojectors.Projectors.PowerStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jackgallaher.smartprojectors.Projectors.Empty,
      com.jackgallaher.smartprojectors.Projectors.PowerStatus> getSwitchOnMethod() {
    io.grpc.MethodDescriptor<com.jackgallaher.smartprojectors.Projectors.Empty, com.jackgallaher.smartprojectors.Projectors.PowerStatus> getSwitchOnMethod;
    if ((getSwitchOnMethod = smartProjectorsGrpc.getSwitchOnMethod) == null) {
      synchronized (smartProjectorsGrpc.class) {
        if ((getSwitchOnMethod = smartProjectorsGrpc.getSwitchOnMethod) == null) {
          smartProjectorsGrpc.getSwitchOnMethod = getSwitchOnMethod = 
              io.grpc.MethodDescriptor.<com.jackgallaher.smartprojectors.Projectors.Empty, com.jackgallaher.smartprojectors.Projectors.PowerStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.jackgallaher.smartprojectors.smartProjectors", "switchOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartprojectors.Projectors.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartprojectors.Projectors.PowerStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new smartProjectorsMethodDescriptorSupplier("switchOn"))
                  .build();
          }
        }
     }
     return getSwitchOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jackgallaher.smartprojectors.Projectors.Empty,
      com.jackgallaher.smartprojectors.Projectors.PowerStatus> getSwitchOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchOff",
      requestType = com.jackgallaher.smartprojectors.Projectors.Empty.class,
      responseType = com.jackgallaher.smartprojectors.Projectors.PowerStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jackgallaher.smartprojectors.Projectors.Empty,
      com.jackgallaher.smartprojectors.Projectors.PowerStatus> getSwitchOffMethod() {
    io.grpc.MethodDescriptor<com.jackgallaher.smartprojectors.Projectors.Empty, com.jackgallaher.smartprojectors.Projectors.PowerStatus> getSwitchOffMethod;
    if ((getSwitchOffMethod = smartProjectorsGrpc.getSwitchOffMethod) == null) {
      synchronized (smartProjectorsGrpc.class) {
        if ((getSwitchOffMethod = smartProjectorsGrpc.getSwitchOffMethod) == null) {
          smartProjectorsGrpc.getSwitchOffMethod = getSwitchOffMethod = 
              io.grpc.MethodDescriptor.<com.jackgallaher.smartprojectors.Projectors.Empty, com.jackgallaher.smartprojectors.Projectors.PowerStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.jackgallaher.smartprojectors.smartProjectors", "switchOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartprojectors.Projectors.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartprojectors.Projectors.PowerStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new smartProjectorsMethodDescriptorSupplier("switchOff"))
                  .build();
          }
        }
     }
     return getSwitchOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jackgallaher.smartprojectors.Projectors.Empty,
      com.jackgallaher.smartprojectors.Projectors.Response> getInputHDMIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "inputHDMI",
      requestType = com.jackgallaher.smartprojectors.Projectors.Empty.class,
      responseType = com.jackgallaher.smartprojectors.Projectors.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jackgallaher.smartprojectors.Projectors.Empty,
      com.jackgallaher.smartprojectors.Projectors.Response> getInputHDMIMethod() {
    io.grpc.MethodDescriptor<com.jackgallaher.smartprojectors.Projectors.Empty, com.jackgallaher.smartprojectors.Projectors.Response> getInputHDMIMethod;
    if ((getInputHDMIMethod = smartProjectorsGrpc.getInputHDMIMethod) == null) {
      synchronized (smartProjectorsGrpc.class) {
        if ((getInputHDMIMethod = smartProjectorsGrpc.getInputHDMIMethod) == null) {
          smartProjectorsGrpc.getInputHDMIMethod = getInputHDMIMethod = 
              io.grpc.MethodDescriptor.<com.jackgallaher.smartprojectors.Projectors.Empty, com.jackgallaher.smartprojectors.Projectors.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.jackgallaher.smartprojectors.smartProjectors", "inputHDMI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartprojectors.Projectors.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartprojectors.Projectors.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new smartProjectorsMethodDescriptorSupplier("inputHDMI"))
                  .build();
          }
        }
     }
     return getInputHDMIMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jackgallaher.smartprojectors.Projectors.Empty,
      com.jackgallaher.smartprojectors.Projectors.Response> getInputVGAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "inputVGA",
      requestType = com.jackgallaher.smartprojectors.Projectors.Empty.class,
      responseType = com.jackgallaher.smartprojectors.Projectors.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jackgallaher.smartprojectors.Projectors.Empty,
      com.jackgallaher.smartprojectors.Projectors.Response> getInputVGAMethod() {
    io.grpc.MethodDescriptor<com.jackgallaher.smartprojectors.Projectors.Empty, com.jackgallaher.smartprojectors.Projectors.Response> getInputVGAMethod;
    if ((getInputVGAMethod = smartProjectorsGrpc.getInputVGAMethod) == null) {
      synchronized (smartProjectorsGrpc.class) {
        if ((getInputVGAMethod = smartProjectorsGrpc.getInputVGAMethod) == null) {
          smartProjectorsGrpc.getInputVGAMethod = getInputVGAMethod = 
              io.grpc.MethodDescriptor.<com.jackgallaher.smartprojectors.Projectors.Empty, com.jackgallaher.smartprojectors.Projectors.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.jackgallaher.smartprojectors.smartProjectors", "inputVGA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartprojectors.Projectors.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartprojectors.Projectors.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new smartProjectorsMethodDescriptorSupplier("inputVGA"))
                  .build();
          }
        }
     }
     return getInputVGAMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static smartProjectorsStub newStub(io.grpc.Channel channel) {
    return new smartProjectorsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static smartProjectorsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new smartProjectorsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static smartProjectorsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new smartProjectorsFutureStub(channel);
  }

  /**
   */
  public static abstract class smartProjectorsImplBase implements io.grpc.BindableService {

    /**
     */
    public void switchOn(com.jackgallaher.smartprojectors.Projectors.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartprojectors.Projectors.PowerStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchOnMethod(), responseObserver);
    }

    /**
     */
    public void switchOff(com.jackgallaher.smartprojectors.Projectors.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartprojectors.Projectors.PowerStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchOffMethod(), responseObserver);
    }

    /**
     */
    public void inputHDMI(com.jackgallaher.smartprojectors.Projectors.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartprojectors.Projectors.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getInputHDMIMethod(), responseObserver);
    }

    /**
     */
    public void inputVGA(com.jackgallaher.smartprojectors.Projectors.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartprojectors.Projectors.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getInputVGAMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSwitchOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jackgallaher.smartprojectors.Projectors.Empty,
                com.jackgallaher.smartprojectors.Projectors.PowerStatus>(
                  this, METHODID_SWITCH_ON)))
          .addMethod(
            getSwitchOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jackgallaher.smartprojectors.Projectors.Empty,
                com.jackgallaher.smartprojectors.Projectors.PowerStatus>(
                  this, METHODID_SWITCH_OFF)))
          .addMethod(
            getInputHDMIMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jackgallaher.smartprojectors.Projectors.Empty,
                com.jackgallaher.smartprojectors.Projectors.Response>(
                  this, METHODID_INPUT_HDMI)))
          .addMethod(
            getInputVGAMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jackgallaher.smartprojectors.Projectors.Empty,
                com.jackgallaher.smartprojectors.Projectors.Response>(
                  this, METHODID_INPUT_VGA)))
          .build();
    }
  }

  /**
   */
  public static final class smartProjectorsStub extends io.grpc.stub.AbstractStub<smartProjectorsStub> {
    private smartProjectorsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartProjectorsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartProjectorsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartProjectorsStub(channel, callOptions);
    }

    /**
     */
    public void switchOn(com.jackgallaher.smartprojectors.Projectors.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartprojectors.Projectors.PowerStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void switchOff(com.jackgallaher.smartprojectors.Projectors.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartprojectors.Projectors.PowerStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void inputHDMI(com.jackgallaher.smartprojectors.Projectors.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartprojectors.Projectors.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInputHDMIMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void inputVGA(com.jackgallaher.smartprojectors.Projectors.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartprojectors.Projectors.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInputVGAMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class smartProjectorsBlockingStub extends io.grpc.stub.AbstractStub<smartProjectorsBlockingStub> {
    private smartProjectorsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartProjectorsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartProjectorsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartProjectorsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.jackgallaher.smartprojectors.Projectors.PowerStatus switchOn(com.jackgallaher.smartprojectors.Projectors.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSwitchOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.jackgallaher.smartprojectors.Projectors.PowerStatus switchOff(com.jackgallaher.smartprojectors.Projectors.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSwitchOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.jackgallaher.smartprojectors.Projectors.Response inputHDMI(com.jackgallaher.smartprojectors.Projectors.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInputHDMIMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.jackgallaher.smartprojectors.Projectors.Response inputVGA(com.jackgallaher.smartprojectors.Projectors.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInputVGAMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class smartProjectorsFutureStub extends io.grpc.stub.AbstractStub<smartProjectorsFutureStub> {
    private smartProjectorsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartProjectorsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartProjectorsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartProjectorsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jackgallaher.smartprojectors.Projectors.PowerStatus> switchOn(
        com.jackgallaher.smartprojectors.Projectors.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jackgallaher.smartprojectors.Projectors.PowerStatus> switchOff(
        com.jackgallaher.smartprojectors.Projectors.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jackgallaher.smartprojectors.Projectors.Response> inputHDMI(
        com.jackgallaher.smartprojectors.Projectors.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInputHDMIMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jackgallaher.smartprojectors.Projectors.Response> inputVGA(
        com.jackgallaher.smartprojectors.Projectors.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInputVGAMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SWITCH_ON = 0;
  private static final int METHODID_SWITCH_OFF = 1;
  private static final int METHODID_INPUT_HDMI = 2;
  private static final int METHODID_INPUT_VGA = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final smartProjectorsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(smartProjectorsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SWITCH_ON:
          serviceImpl.switchOn((com.jackgallaher.smartprojectors.Projectors.Empty) request,
              (io.grpc.stub.StreamObserver<com.jackgallaher.smartprojectors.Projectors.PowerStatus>) responseObserver);
          break;
        case METHODID_SWITCH_OFF:
          serviceImpl.switchOff((com.jackgallaher.smartprojectors.Projectors.Empty) request,
              (io.grpc.stub.StreamObserver<com.jackgallaher.smartprojectors.Projectors.PowerStatus>) responseObserver);
          break;
        case METHODID_INPUT_HDMI:
          serviceImpl.inputHDMI((com.jackgallaher.smartprojectors.Projectors.Empty) request,
              (io.grpc.stub.StreamObserver<com.jackgallaher.smartprojectors.Projectors.Response>) responseObserver);
          break;
        case METHODID_INPUT_VGA:
          serviceImpl.inputVGA((com.jackgallaher.smartprojectors.Projectors.Empty) request,
              (io.grpc.stub.StreamObserver<com.jackgallaher.smartprojectors.Projectors.Response>) responseObserver);
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

  private static abstract class smartProjectorsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    smartProjectorsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jackgallaher.smartprojectors.Projectors.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("smartProjectors");
    }
  }

  private static final class smartProjectorsFileDescriptorSupplier
      extends smartProjectorsBaseDescriptorSupplier {
    smartProjectorsFileDescriptorSupplier() {}
  }

  private static final class smartProjectorsMethodDescriptorSupplier
      extends smartProjectorsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    smartProjectorsMethodDescriptorSupplier(String methodName) {
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
      synchronized (smartProjectorsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new smartProjectorsFileDescriptorSupplier())
              .addMethod(getSwitchOnMethod())
              .addMethod(getSwitchOffMethod())
              .addMethod(getInputHDMIMethod())
              .addMethod(getInputVGAMethod())
              .build();
        }
      }
    }
    return result;
  }
}
