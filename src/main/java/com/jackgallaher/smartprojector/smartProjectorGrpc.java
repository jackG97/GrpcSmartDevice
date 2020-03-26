package com.jackgallaher.smartprojector;

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
    comments = "Source: projector.proto")
public final class smartProjectorGrpc {

  private smartProjectorGrpc() {}

  public static final String SERVICE_NAME = "smartdevice.smartProjector";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.jackgallaher.smartprojector.PowerStatus> getSwitchOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchOn",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.jackgallaher.smartprojector.PowerStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.jackgallaher.smartprojector.PowerStatus> getSwitchOnMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.jackgallaher.smartprojector.PowerStatus> getSwitchOnMethod;
    if ((getSwitchOnMethod = smartProjectorGrpc.getSwitchOnMethod) == null) {
      synchronized (smartProjectorGrpc.class) {
        if ((getSwitchOnMethod = smartProjectorGrpc.getSwitchOnMethod) == null) {
          smartProjectorGrpc.getSwitchOnMethod = getSwitchOnMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.jackgallaher.smartprojector.PowerStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartdevice.smartProjector", "switchOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartprojector.PowerStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new smartProjectorMethodDescriptorSupplier("switchOn"))
                  .build();
          }
        }
     }
     return getSwitchOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.jackgallaher.smartprojector.PowerStatus> getSwitchOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchOff",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.jackgallaher.smartprojector.PowerStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.jackgallaher.smartprojector.PowerStatus> getSwitchOffMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.jackgallaher.smartprojector.PowerStatus> getSwitchOffMethod;
    if ((getSwitchOffMethod = smartProjectorGrpc.getSwitchOffMethod) == null) {
      synchronized (smartProjectorGrpc.class) {
        if ((getSwitchOffMethod = smartProjectorGrpc.getSwitchOffMethod) == null) {
          smartProjectorGrpc.getSwitchOffMethod = getSwitchOffMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.jackgallaher.smartprojector.PowerStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartdevice.smartProjector", "switchOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartprojector.PowerStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new smartProjectorMethodDescriptorSupplier("switchOff"))
                  .build();
          }
        }
     }
     return getSwitchOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.jackgallaher.smartprojector.Response> getInputHDMIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "inputHDMI",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.jackgallaher.smartprojector.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.jackgallaher.smartprojector.Response> getInputHDMIMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.jackgallaher.smartprojector.Response> getInputHDMIMethod;
    if ((getInputHDMIMethod = smartProjectorGrpc.getInputHDMIMethod) == null) {
      synchronized (smartProjectorGrpc.class) {
        if ((getInputHDMIMethod = smartProjectorGrpc.getInputHDMIMethod) == null) {
          smartProjectorGrpc.getInputHDMIMethod = getInputHDMIMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.jackgallaher.smartprojector.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartdevice.smartProjector", "inputHDMI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartprojector.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new smartProjectorMethodDescriptorSupplier("inputHDMI"))
                  .build();
          }
        }
     }
     return getInputHDMIMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.jackgallaher.smartprojector.Response> getInputVGAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "inputVGA",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.jackgallaher.smartprojector.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.jackgallaher.smartprojector.Response> getInputVGAMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.jackgallaher.smartprojector.Response> getInputVGAMethod;
    if ((getInputVGAMethod = smartProjectorGrpc.getInputVGAMethod) == null) {
      synchronized (smartProjectorGrpc.class) {
        if ((getInputVGAMethod = smartProjectorGrpc.getInputVGAMethod) == null) {
          smartProjectorGrpc.getInputVGAMethod = getInputVGAMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.jackgallaher.smartprojector.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartdevice.smartProjector", "inputVGA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartprojector.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new smartProjectorMethodDescriptorSupplier("inputVGA"))
                  .build();
          }
        }
     }
     return getInputVGAMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static smartProjectorStub newStub(io.grpc.Channel channel) {
    return new smartProjectorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static smartProjectorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new smartProjectorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static smartProjectorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new smartProjectorFutureStub(channel);
  }

  /**
   */
  public static abstract class smartProjectorImplBase implements io.grpc.BindableService {

    /**
     */
    public void switchOn(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartprojector.PowerStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchOnMethod(), responseObserver);
    }

    /**
     */
    public void switchOff(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartprojector.PowerStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchOffMethod(), responseObserver);
    }

    /**
     */
    public void inputHDMI(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartprojector.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getInputHDMIMethod(), responseObserver);
    }

    /**
     */
    public void inputVGA(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartprojector.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getInputVGAMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSwitchOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.jackgallaher.smartprojector.PowerStatus>(
                  this, METHODID_SWITCH_ON)))
          .addMethod(
            getSwitchOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.jackgallaher.smartprojector.PowerStatus>(
                  this, METHODID_SWITCH_OFF)))
          .addMethod(
            getInputHDMIMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.jackgallaher.smartprojector.Response>(
                  this, METHODID_INPUT_HDMI)))
          .addMethod(
            getInputVGAMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.jackgallaher.smartprojector.Response>(
                  this, METHODID_INPUT_VGA)))
          .build();
    }
  }

  /**
   */
  public static final class smartProjectorStub extends io.grpc.stub.AbstractStub<smartProjectorStub> {
    private smartProjectorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartProjectorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartProjectorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartProjectorStub(channel, callOptions);
    }

    /**
     */
    public void switchOn(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartprojector.PowerStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void switchOff(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartprojector.PowerStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void inputHDMI(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartprojector.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInputHDMIMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void inputVGA(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartprojector.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInputVGAMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class smartProjectorBlockingStub extends io.grpc.stub.AbstractStub<smartProjectorBlockingStub> {
    private smartProjectorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartProjectorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartProjectorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartProjectorBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.jackgallaher.smartprojector.PowerStatus switchOn(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSwitchOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.jackgallaher.smartprojector.PowerStatus switchOff(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSwitchOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.jackgallaher.smartprojector.Response inputHDMI(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInputHDMIMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.jackgallaher.smartprojector.Response inputVGA(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInputVGAMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class smartProjectorFutureStub extends io.grpc.stub.AbstractStub<smartProjectorFutureStub> {
    private smartProjectorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartProjectorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartProjectorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartProjectorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jackgallaher.smartprojector.PowerStatus> switchOn(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jackgallaher.smartprojector.PowerStatus> switchOff(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jackgallaher.smartprojector.Response> inputHDMI(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInputHDMIMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jackgallaher.smartprojector.Response> inputVGA(
        com.google.protobuf.Empty request) {
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
    private final smartProjectorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(smartProjectorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SWITCH_ON:
          serviceImpl.switchOn((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.jackgallaher.smartprojector.PowerStatus>) responseObserver);
          break;
        case METHODID_SWITCH_OFF:
          serviceImpl.switchOff((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.jackgallaher.smartprojector.PowerStatus>) responseObserver);
          break;
        case METHODID_INPUT_HDMI:
          serviceImpl.inputHDMI((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.jackgallaher.smartprojector.Response>) responseObserver);
          break;
        case METHODID_INPUT_VGA:
          serviceImpl.inputVGA((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.jackgallaher.smartprojector.Response>) responseObserver);
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

  private static abstract class smartProjectorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    smartProjectorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jackgallaher.smartprojector.SmartDeviceProjectorImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("smartProjector");
    }
  }

  private static final class smartProjectorFileDescriptorSupplier
      extends smartProjectorBaseDescriptorSupplier {
    smartProjectorFileDescriptorSupplier() {}
  }

  private static final class smartProjectorMethodDescriptorSupplier
      extends smartProjectorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    smartProjectorMethodDescriptorSupplier(String methodName) {
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
      synchronized (smartProjectorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new smartProjectorFileDescriptorSupplier())
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
