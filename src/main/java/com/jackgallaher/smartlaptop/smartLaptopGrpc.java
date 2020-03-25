package com.jackgallaher.smartlaptop;

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
    comments = "Source: laptop.proto")
public final class smartLaptopGrpc {

  private smartLaptopGrpc() {}

  public static final String SERVICE_NAME = "smartdevice.smartLaptop";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.jackgallaher.smartlaptop.PowerStatus> getSwitchOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchOn",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.jackgallaher.smartlaptop.PowerStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.jackgallaher.smartlaptop.PowerStatus> getSwitchOnMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.jackgallaher.smartlaptop.PowerStatus> getSwitchOnMethod;
    if ((getSwitchOnMethod = smartLaptopGrpc.getSwitchOnMethod) == null) {
      synchronized (smartLaptopGrpc.class) {
        if ((getSwitchOnMethod = smartLaptopGrpc.getSwitchOnMethod) == null) {
          smartLaptopGrpc.getSwitchOnMethod = getSwitchOnMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.jackgallaher.smartlaptop.PowerStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartdevice.smartLaptop", "switchOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartlaptop.PowerStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new smartLaptopMethodDescriptorSupplier("switchOn"))
                  .build();
          }
        }
     }
     return getSwitchOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.jackgallaher.smartlaptop.PowerStatus> getSwitchOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchOff",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.jackgallaher.smartlaptop.PowerStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.jackgallaher.smartlaptop.PowerStatus> getSwitchOffMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.jackgallaher.smartlaptop.PowerStatus> getSwitchOffMethod;
    if ((getSwitchOffMethod = smartLaptopGrpc.getSwitchOffMethod) == null) {
      synchronized (smartLaptopGrpc.class) {
        if ((getSwitchOffMethod = smartLaptopGrpc.getSwitchOffMethod) == null) {
          smartLaptopGrpc.getSwitchOffMethod = getSwitchOffMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.jackgallaher.smartlaptop.PowerStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartdevice.smartLaptop", "switchOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jackgallaher.smartlaptop.PowerStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new smartLaptopMethodDescriptorSupplier("switchOff"))
                  .build();
          }
        }
     }
     return getSwitchOffMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static smartLaptopStub newStub(io.grpc.Channel channel) {
    return new smartLaptopStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static smartLaptopBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new smartLaptopBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static smartLaptopFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new smartLaptopFutureStub(channel);
  }

  /**
   */
  public static abstract class smartLaptopImplBase implements io.grpc.BindableService {

    /**
     */
    public void switchOn(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartlaptop.PowerStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchOnMethod(), responseObserver);
    }

    /**
     */
    public void switchOff(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartlaptop.PowerStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchOffMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSwitchOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.jackgallaher.smartlaptop.PowerStatus>(
                  this, METHODID_SWITCH_ON)))
          .addMethod(
            getSwitchOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.jackgallaher.smartlaptop.PowerStatus>(
                  this, METHODID_SWITCH_OFF)))
          .build();
    }
  }

  /**
   */
  public static final class smartLaptopStub extends io.grpc.stub.AbstractStub<smartLaptopStub> {
    private smartLaptopStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartLaptopStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartLaptopStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartLaptopStub(channel, callOptions);
    }

    /**
     */
    public void switchOn(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartlaptop.PowerStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void switchOff(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.jackgallaher.smartlaptop.PowerStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchOffMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class smartLaptopBlockingStub extends io.grpc.stub.AbstractStub<smartLaptopBlockingStub> {
    private smartLaptopBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartLaptopBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartLaptopBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartLaptopBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.jackgallaher.smartlaptop.PowerStatus switchOn(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSwitchOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.jackgallaher.smartlaptop.PowerStatus switchOff(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSwitchOffMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class smartLaptopFutureStub extends io.grpc.stub.AbstractStub<smartLaptopFutureStub> {
    private smartLaptopFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartLaptopFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartLaptopFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartLaptopFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jackgallaher.smartlaptop.PowerStatus> switchOn(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jackgallaher.smartlaptop.PowerStatus> switchOff(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchOffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SWITCH_ON = 0;
  private static final int METHODID_SWITCH_OFF = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final smartLaptopImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(smartLaptopImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SWITCH_ON:
          serviceImpl.switchOn((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.jackgallaher.smartlaptop.PowerStatus>) responseObserver);
          break;
        case METHODID_SWITCH_OFF:
          serviceImpl.switchOff((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.jackgallaher.smartlaptop.PowerStatus>) responseObserver);
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

  private static abstract class smartLaptopBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    smartLaptopBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jackgallaher.smartlaptop.SmartDeviceLaptopImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("smartLaptop");
    }
  }

  private static final class smartLaptopFileDescriptorSupplier
      extends smartLaptopBaseDescriptorSupplier {
    smartLaptopFileDescriptorSupplier() {}
  }

  private static final class smartLaptopMethodDescriptorSupplier
      extends smartLaptopBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    smartLaptopMethodDescriptorSupplier(String methodName) {
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
      synchronized (smartLaptopGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new smartLaptopFileDescriptorSupplier())
              .addMethod(getSwitchOnMethod())
              .addMethod(getSwitchOffMethod())
              .build();
        }
      }
    }
    return result;
  }
}
