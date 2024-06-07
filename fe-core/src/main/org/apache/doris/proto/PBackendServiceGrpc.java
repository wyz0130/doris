package org.apache.doris.proto;

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
    value = "by gRPC proto compiler (version 1.34.0)",
    comments = "Source: internal_service.proto")
public final class PBackendServiceGrpc {

  private PBackendServiceGrpc() {}

  public static final String SERVICE_NAME = "doris.PBackendService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTransmitDataParams,
      org.apache.doris.proto.InternalService.PTransmitDataResult> getTransmitDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "transmit_data",
      requestType = org.apache.doris.proto.InternalService.PTransmitDataParams.class,
      responseType = org.apache.doris.proto.InternalService.PTransmitDataResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTransmitDataParams,
      org.apache.doris.proto.InternalService.PTransmitDataResult> getTransmitDataMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTransmitDataParams, org.apache.doris.proto.InternalService.PTransmitDataResult> getTransmitDataMethod;
    if ((getTransmitDataMethod = PBackendServiceGrpc.getTransmitDataMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getTransmitDataMethod = PBackendServiceGrpc.getTransmitDataMethod) == null) {
          PBackendServiceGrpc.getTransmitDataMethod = getTransmitDataMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PTransmitDataParams, org.apache.doris.proto.InternalService.PTransmitDataResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "transmit_data"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PTransmitDataParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PTransmitDataResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("transmit_data"))
              .build();
        }
      }
    }
    return getTransmitDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PEmptyRequest,
      org.apache.doris.proto.InternalService.PTransmitDataResult> getTransmitDataByHttpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "transmit_data_by_http",
      requestType = org.apache.doris.proto.InternalService.PEmptyRequest.class,
      responseType = org.apache.doris.proto.InternalService.PTransmitDataResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PEmptyRequest,
      org.apache.doris.proto.InternalService.PTransmitDataResult> getTransmitDataByHttpMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PEmptyRequest, org.apache.doris.proto.InternalService.PTransmitDataResult> getTransmitDataByHttpMethod;
    if ((getTransmitDataByHttpMethod = PBackendServiceGrpc.getTransmitDataByHttpMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getTransmitDataByHttpMethod = PBackendServiceGrpc.getTransmitDataByHttpMethod) == null) {
          PBackendServiceGrpc.getTransmitDataByHttpMethod = getTransmitDataByHttpMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PEmptyRequest, org.apache.doris.proto.InternalService.PTransmitDataResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "transmit_data_by_http"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PEmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PTransmitDataResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("transmit_data_by_http"))
              .build();
        }
      }
    }
    return getTransmitDataByHttpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PExecPlanFragmentRequest,
      org.apache.doris.proto.InternalService.PExecPlanFragmentResult> getExecPlanFragmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "exec_plan_fragment",
      requestType = org.apache.doris.proto.InternalService.PExecPlanFragmentRequest.class,
      responseType = org.apache.doris.proto.InternalService.PExecPlanFragmentResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PExecPlanFragmentRequest,
      org.apache.doris.proto.InternalService.PExecPlanFragmentResult> getExecPlanFragmentMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PExecPlanFragmentRequest, org.apache.doris.proto.InternalService.PExecPlanFragmentResult> getExecPlanFragmentMethod;
    if ((getExecPlanFragmentMethod = PBackendServiceGrpc.getExecPlanFragmentMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getExecPlanFragmentMethod = PBackendServiceGrpc.getExecPlanFragmentMethod) == null) {
          PBackendServiceGrpc.getExecPlanFragmentMethod = getExecPlanFragmentMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PExecPlanFragmentRequest, org.apache.doris.proto.InternalService.PExecPlanFragmentResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "exec_plan_fragment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PExecPlanFragmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PExecPlanFragmentResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("exec_plan_fragment"))
              .build();
        }
      }
    }
    return getExecPlanFragmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PExecPlanFragmentRequest,
      org.apache.doris.proto.InternalService.PExecPlanFragmentResult> getExecPlanFragmentPrepareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "exec_plan_fragment_prepare",
      requestType = org.apache.doris.proto.InternalService.PExecPlanFragmentRequest.class,
      responseType = org.apache.doris.proto.InternalService.PExecPlanFragmentResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PExecPlanFragmentRequest,
      org.apache.doris.proto.InternalService.PExecPlanFragmentResult> getExecPlanFragmentPrepareMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PExecPlanFragmentRequest, org.apache.doris.proto.InternalService.PExecPlanFragmentResult> getExecPlanFragmentPrepareMethod;
    if ((getExecPlanFragmentPrepareMethod = PBackendServiceGrpc.getExecPlanFragmentPrepareMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getExecPlanFragmentPrepareMethod = PBackendServiceGrpc.getExecPlanFragmentPrepareMethod) == null) {
          PBackendServiceGrpc.getExecPlanFragmentPrepareMethod = getExecPlanFragmentPrepareMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PExecPlanFragmentRequest, org.apache.doris.proto.InternalService.PExecPlanFragmentResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "exec_plan_fragment_prepare"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PExecPlanFragmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PExecPlanFragmentResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("exec_plan_fragment_prepare"))
              .build();
        }
      }
    }
    return getExecPlanFragmentPrepareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PExecPlanFragmentStartRequest,
      org.apache.doris.proto.InternalService.PExecPlanFragmentResult> getExecPlanFragmentStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "exec_plan_fragment_start",
      requestType = org.apache.doris.proto.InternalService.PExecPlanFragmentStartRequest.class,
      responseType = org.apache.doris.proto.InternalService.PExecPlanFragmentResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PExecPlanFragmentStartRequest,
      org.apache.doris.proto.InternalService.PExecPlanFragmentResult> getExecPlanFragmentStartMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PExecPlanFragmentStartRequest, org.apache.doris.proto.InternalService.PExecPlanFragmentResult> getExecPlanFragmentStartMethod;
    if ((getExecPlanFragmentStartMethod = PBackendServiceGrpc.getExecPlanFragmentStartMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getExecPlanFragmentStartMethod = PBackendServiceGrpc.getExecPlanFragmentStartMethod) == null) {
          PBackendServiceGrpc.getExecPlanFragmentStartMethod = getExecPlanFragmentStartMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PExecPlanFragmentStartRequest, org.apache.doris.proto.InternalService.PExecPlanFragmentResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "exec_plan_fragment_start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PExecPlanFragmentStartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PExecPlanFragmentResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("exec_plan_fragment_start"))
              .build();
        }
      }
    }
    return getExecPlanFragmentStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PCancelPlanFragmentRequest,
      org.apache.doris.proto.InternalService.PCancelPlanFragmentResult> getCancelPlanFragmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cancel_plan_fragment",
      requestType = org.apache.doris.proto.InternalService.PCancelPlanFragmentRequest.class,
      responseType = org.apache.doris.proto.InternalService.PCancelPlanFragmentResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PCancelPlanFragmentRequest,
      org.apache.doris.proto.InternalService.PCancelPlanFragmentResult> getCancelPlanFragmentMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PCancelPlanFragmentRequest, org.apache.doris.proto.InternalService.PCancelPlanFragmentResult> getCancelPlanFragmentMethod;
    if ((getCancelPlanFragmentMethod = PBackendServiceGrpc.getCancelPlanFragmentMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getCancelPlanFragmentMethod = PBackendServiceGrpc.getCancelPlanFragmentMethod) == null) {
          PBackendServiceGrpc.getCancelPlanFragmentMethod = getCancelPlanFragmentMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PCancelPlanFragmentRequest, org.apache.doris.proto.InternalService.PCancelPlanFragmentResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "cancel_plan_fragment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PCancelPlanFragmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PCancelPlanFragmentResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("cancel_plan_fragment"))
              .build();
        }
      }
    }
    return getCancelPlanFragmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PFetchDataRequest,
      org.apache.doris.proto.InternalService.PFetchDataResult> getFetchDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fetch_data",
      requestType = org.apache.doris.proto.InternalService.PFetchDataRequest.class,
      responseType = org.apache.doris.proto.InternalService.PFetchDataResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PFetchDataRequest,
      org.apache.doris.proto.InternalService.PFetchDataResult> getFetchDataMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PFetchDataRequest, org.apache.doris.proto.InternalService.PFetchDataResult> getFetchDataMethod;
    if ((getFetchDataMethod = PBackendServiceGrpc.getFetchDataMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getFetchDataMethod = PBackendServiceGrpc.getFetchDataMethod) == null) {
          PBackendServiceGrpc.getFetchDataMethod = getFetchDataMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PFetchDataRequest, org.apache.doris.proto.InternalService.PFetchDataResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "fetch_data"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PFetchDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PFetchDataResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("fetch_data"))
              .build();
        }
      }
    }
    return getFetchDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTabletWriterOpenRequest,
      org.apache.doris.proto.InternalService.PTabletWriterOpenResult> getTabletWriterOpenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "tablet_writer_open",
      requestType = org.apache.doris.proto.InternalService.PTabletWriterOpenRequest.class,
      responseType = org.apache.doris.proto.InternalService.PTabletWriterOpenResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTabletWriterOpenRequest,
      org.apache.doris.proto.InternalService.PTabletWriterOpenResult> getTabletWriterOpenMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTabletWriterOpenRequest, org.apache.doris.proto.InternalService.PTabletWriterOpenResult> getTabletWriterOpenMethod;
    if ((getTabletWriterOpenMethod = PBackendServiceGrpc.getTabletWriterOpenMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getTabletWriterOpenMethod = PBackendServiceGrpc.getTabletWriterOpenMethod) == null) {
          PBackendServiceGrpc.getTabletWriterOpenMethod = getTabletWriterOpenMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PTabletWriterOpenRequest, org.apache.doris.proto.InternalService.PTabletWriterOpenResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "tablet_writer_open"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PTabletWriterOpenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PTabletWriterOpenResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("tablet_writer_open"))
              .build();
        }
      }
    }
    return getTabletWriterOpenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.POpenLoadStreamRequest,
      org.apache.doris.proto.InternalService.POpenLoadStreamResponse> getOpenLoadStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "open_load_stream",
      requestType = org.apache.doris.proto.InternalService.POpenLoadStreamRequest.class,
      responseType = org.apache.doris.proto.InternalService.POpenLoadStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.POpenLoadStreamRequest,
      org.apache.doris.proto.InternalService.POpenLoadStreamResponse> getOpenLoadStreamMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.POpenLoadStreamRequest, org.apache.doris.proto.InternalService.POpenLoadStreamResponse> getOpenLoadStreamMethod;
    if ((getOpenLoadStreamMethod = PBackendServiceGrpc.getOpenLoadStreamMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getOpenLoadStreamMethod = PBackendServiceGrpc.getOpenLoadStreamMethod) == null) {
          PBackendServiceGrpc.getOpenLoadStreamMethod = getOpenLoadStreamMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.POpenLoadStreamRequest, org.apache.doris.proto.InternalService.POpenLoadStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "open_load_stream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.POpenLoadStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.POpenLoadStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("open_load_stream"))
              .build();
        }
      }
    }
    return getOpenLoadStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTabletWriterAddBlockRequest,
      org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult> getTabletWriterAddBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "tablet_writer_add_block",
      requestType = org.apache.doris.proto.InternalService.PTabletWriterAddBlockRequest.class,
      responseType = org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTabletWriterAddBlockRequest,
      org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult> getTabletWriterAddBlockMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTabletWriterAddBlockRequest, org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult> getTabletWriterAddBlockMethod;
    if ((getTabletWriterAddBlockMethod = PBackendServiceGrpc.getTabletWriterAddBlockMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getTabletWriterAddBlockMethod = PBackendServiceGrpc.getTabletWriterAddBlockMethod) == null) {
          PBackendServiceGrpc.getTabletWriterAddBlockMethod = getTabletWriterAddBlockMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PTabletWriterAddBlockRequest, org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "tablet_writer_add_block"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PTabletWriterAddBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("tablet_writer_add_block"))
              .build();
        }
      }
    }
    return getTabletWriterAddBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PEmptyRequest,
      org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult> getTabletWriterAddBlockByHttpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "tablet_writer_add_block_by_http",
      requestType = org.apache.doris.proto.InternalService.PEmptyRequest.class,
      responseType = org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PEmptyRequest,
      org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult> getTabletWriterAddBlockByHttpMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PEmptyRequest, org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult> getTabletWriterAddBlockByHttpMethod;
    if ((getTabletWriterAddBlockByHttpMethod = PBackendServiceGrpc.getTabletWriterAddBlockByHttpMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getTabletWriterAddBlockByHttpMethod = PBackendServiceGrpc.getTabletWriterAddBlockByHttpMethod) == null) {
          PBackendServiceGrpc.getTabletWriterAddBlockByHttpMethod = getTabletWriterAddBlockByHttpMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PEmptyRequest, org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "tablet_writer_add_block_by_http"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PEmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("tablet_writer_add_block_by_http"))
              .build();
        }
      }
    }
    return getTabletWriterAddBlockByHttpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTabletWriterCancelRequest,
      org.apache.doris.proto.InternalService.PTabletWriterCancelResult> getTabletWriterCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "tablet_writer_cancel",
      requestType = org.apache.doris.proto.InternalService.PTabletWriterCancelRequest.class,
      responseType = org.apache.doris.proto.InternalService.PTabletWriterCancelResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTabletWriterCancelRequest,
      org.apache.doris.proto.InternalService.PTabletWriterCancelResult> getTabletWriterCancelMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTabletWriterCancelRequest, org.apache.doris.proto.InternalService.PTabletWriterCancelResult> getTabletWriterCancelMethod;
    if ((getTabletWriterCancelMethod = PBackendServiceGrpc.getTabletWriterCancelMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getTabletWriterCancelMethod = PBackendServiceGrpc.getTabletWriterCancelMethod) == null) {
          PBackendServiceGrpc.getTabletWriterCancelMethod = getTabletWriterCancelMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PTabletWriterCancelRequest, org.apache.doris.proto.InternalService.PTabletWriterCancelResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "tablet_writer_cancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PTabletWriterCancelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PTabletWriterCancelResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("tablet_writer_cancel"))
              .build();
        }
      }
    }
    return getTabletWriterCancelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PProxyRequest,
      org.apache.doris.proto.InternalService.PProxyResult> getGetInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get_info",
      requestType = org.apache.doris.proto.InternalService.PProxyRequest.class,
      responseType = org.apache.doris.proto.InternalService.PProxyResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PProxyRequest,
      org.apache.doris.proto.InternalService.PProxyResult> getGetInfoMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PProxyRequest, org.apache.doris.proto.InternalService.PProxyResult> getGetInfoMethod;
    if ((getGetInfoMethod = PBackendServiceGrpc.getGetInfoMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getGetInfoMethod = PBackendServiceGrpc.getGetInfoMethod) == null) {
          PBackendServiceGrpc.getGetInfoMethod = getGetInfoMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PProxyRequest, org.apache.doris.proto.InternalService.PProxyResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get_info"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PProxyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PProxyResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("get_info"))
              .build();
        }
      }
    }
    return getGetInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PUpdateCacheRequest,
      org.apache.doris.proto.InternalService.PCacheResponse> getUpdateCacheMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update_cache",
      requestType = org.apache.doris.proto.InternalService.PUpdateCacheRequest.class,
      responseType = org.apache.doris.proto.InternalService.PCacheResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PUpdateCacheRequest,
      org.apache.doris.proto.InternalService.PCacheResponse> getUpdateCacheMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PUpdateCacheRequest, org.apache.doris.proto.InternalService.PCacheResponse> getUpdateCacheMethod;
    if ((getUpdateCacheMethod = PBackendServiceGrpc.getUpdateCacheMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getUpdateCacheMethod = PBackendServiceGrpc.getUpdateCacheMethod) == null) {
          PBackendServiceGrpc.getUpdateCacheMethod = getUpdateCacheMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PUpdateCacheRequest, org.apache.doris.proto.InternalService.PCacheResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "update_cache"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PUpdateCacheRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PCacheResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("update_cache"))
              .build();
        }
      }
    }
    return getUpdateCacheMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PFetchCacheRequest,
      org.apache.doris.proto.InternalService.PFetchCacheResult> getFetchCacheMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fetch_cache",
      requestType = org.apache.doris.proto.InternalService.PFetchCacheRequest.class,
      responseType = org.apache.doris.proto.InternalService.PFetchCacheResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PFetchCacheRequest,
      org.apache.doris.proto.InternalService.PFetchCacheResult> getFetchCacheMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PFetchCacheRequest, org.apache.doris.proto.InternalService.PFetchCacheResult> getFetchCacheMethod;
    if ((getFetchCacheMethod = PBackendServiceGrpc.getFetchCacheMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getFetchCacheMethod = PBackendServiceGrpc.getFetchCacheMethod) == null) {
          PBackendServiceGrpc.getFetchCacheMethod = getFetchCacheMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PFetchCacheRequest, org.apache.doris.proto.InternalService.PFetchCacheResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "fetch_cache"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PFetchCacheRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PFetchCacheResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("fetch_cache"))
              .build();
        }
      }
    }
    return getFetchCacheMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PClearCacheRequest,
      org.apache.doris.proto.InternalService.PCacheResponse> getClearCacheMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clear_cache",
      requestType = org.apache.doris.proto.InternalService.PClearCacheRequest.class,
      responseType = org.apache.doris.proto.InternalService.PCacheResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PClearCacheRequest,
      org.apache.doris.proto.InternalService.PCacheResponse> getClearCacheMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PClearCacheRequest, org.apache.doris.proto.InternalService.PCacheResponse> getClearCacheMethod;
    if ((getClearCacheMethod = PBackendServiceGrpc.getClearCacheMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getClearCacheMethod = PBackendServiceGrpc.getClearCacheMethod) == null) {
          PBackendServiceGrpc.getClearCacheMethod = getClearCacheMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PClearCacheRequest, org.apache.doris.proto.InternalService.PCacheResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "clear_cache"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PClearCacheRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PCacheResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("clear_cache"))
              .build();
        }
      }
    }
    return getClearCacheMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PSendDataRequest,
      org.apache.doris.proto.InternalService.PSendDataResult> getSendDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "send_data",
      requestType = org.apache.doris.proto.InternalService.PSendDataRequest.class,
      responseType = org.apache.doris.proto.InternalService.PSendDataResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PSendDataRequest,
      org.apache.doris.proto.InternalService.PSendDataResult> getSendDataMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PSendDataRequest, org.apache.doris.proto.InternalService.PSendDataResult> getSendDataMethod;
    if ((getSendDataMethod = PBackendServiceGrpc.getSendDataMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getSendDataMethod = PBackendServiceGrpc.getSendDataMethod) == null) {
          PBackendServiceGrpc.getSendDataMethod = getSendDataMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PSendDataRequest, org.apache.doris.proto.InternalService.PSendDataResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "send_data"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PSendDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PSendDataResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("send_data"))
              .build();
        }
      }
    }
    return getSendDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PCommitRequest,
      org.apache.doris.proto.InternalService.PCommitResult> getCommitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "commit",
      requestType = org.apache.doris.proto.InternalService.PCommitRequest.class,
      responseType = org.apache.doris.proto.InternalService.PCommitResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PCommitRequest,
      org.apache.doris.proto.InternalService.PCommitResult> getCommitMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PCommitRequest, org.apache.doris.proto.InternalService.PCommitResult> getCommitMethod;
    if ((getCommitMethod = PBackendServiceGrpc.getCommitMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getCommitMethod = PBackendServiceGrpc.getCommitMethod) == null) {
          PBackendServiceGrpc.getCommitMethod = getCommitMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PCommitRequest, org.apache.doris.proto.InternalService.PCommitResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "commit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PCommitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PCommitResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("commit"))
              .build();
        }
      }
    }
    return getCommitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PRollbackRequest,
      org.apache.doris.proto.InternalService.PRollbackResult> getRollbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "rollback",
      requestType = org.apache.doris.proto.InternalService.PRollbackRequest.class,
      responseType = org.apache.doris.proto.InternalService.PRollbackResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PRollbackRequest,
      org.apache.doris.proto.InternalService.PRollbackResult> getRollbackMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PRollbackRequest, org.apache.doris.proto.InternalService.PRollbackResult> getRollbackMethod;
    if ((getRollbackMethod = PBackendServiceGrpc.getRollbackMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getRollbackMethod = PBackendServiceGrpc.getRollbackMethod) == null) {
          PBackendServiceGrpc.getRollbackMethod = getRollbackMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PRollbackRequest, org.apache.doris.proto.InternalService.PRollbackResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "rollback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PRollbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PRollbackResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("rollback"))
              .build();
        }
      }
    }
    return getRollbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PMergeFilterRequest,
      org.apache.doris.proto.InternalService.PMergeFilterResponse> getMergeFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "merge_filter",
      requestType = org.apache.doris.proto.InternalService.PMergeFilterRequest.class,
      responseType = org.apache.doris.proto.InternalService.PMergeFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PMergeFilterRequest,
      org.apache.doris.proto.InternalService.PMergeFilterResponse> getMergeFilterMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PMergeFilterRequest, org.apache.doris.proto.InternalService.PMergeFilterResponse> getMergeFilterMethod;
    if ((getMergeFilterMethod = PBackendServiceGrpc.getMergeFilterMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getMergeFilterMethod = PBackendServiceGrpc.getMergeFilterMethod) == null) {
          PBackendServiceGrpc.getMergeFilterMethod = getMergeFilterMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PMergeFilterRequest, org.apache.doris.proto.InternalService.PMergeFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "merge_filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PMergeFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PMergeFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("merge_filter"))
              .build();
        }
      }
    }
    return getMergeFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PSendFilterSizeRequest,
      org.apache.doris.proto.InternalService.PSendFilterSizeResponse> getSendFilterSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "send_filter_size",
      requestType = org.apache.doris.proto.InternalService.PSendFilterSizeRequest.class,
      responseType = org.apache.doris.proto.InternalService.PSendFilterSizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PSendFilterSizeRequest,
      org.apache.doris.proto.InternalService.PSendFilterSizeResponse> getSendFilterSizeMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PSendFilterSizeRequest, org.apache.doris.proto.InternalService.PSendFilterSizeResponse> getSendFilterSizeMethod;
    if ((getSendFilterSizeMethod = PBackendServiceGrpc.getSendFilterSizeMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getSendFilterSizeMethod = PBackendServiceGrpc.getSendFilterSizeMethod) == null) {
          PBackendServiceGrpc.getSendFilterSizeMethod = getSendFilterSizeMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PSendFilterSizeRequest, org.apache.doris.proto.InternalService.PSendFilterSizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "send_filter_size"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PSendFilterSizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PSendFilterSizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("send_filter_size"))
              .build();
        }
      }
    }
    return getSendFilterSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PSyncFilterSizeRequest,
      org.apache.doris.proto.InternalService.PSyncFilterSizeResponse> getSyncFilterSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sync_filter_size",
      requestType = org.apache.doris.proto.InternalService.PSyncFilterSizeRequest.class,
      responseType = org.apache.doris.proto.InternalService.PSyncFilterSizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PSyncFilterSizeRequest,
      org.apache.doris.proto.InternalService.PSyncFilterSizeResponse> getSyncFilterSizeMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PSyncFilterSizeRequest, org.apache.doris.proto.InternalService.PSyncFilterSizeResponse> getSyncFilterSizeMethod;
    if ((getSyncFilterSizeMethod = PBackendServiceGrpc.getSyncFilterSizeMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getSyncFilterSizeMethod = PBackendServiceGrpc.getSyncFilterSizeMethod) == null) {
          PBackendServiceGrpc.getSyncFilterSizeMethod = getSyncFilterSizeMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PSyncFilterSizeRequest, org.apache.doris.proto.InternalService.PSyncFilterSizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sync_filter_size"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PSyncFilterSizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PSyncFilterSizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("sync_filter_size"))
              .build();
        }
      }
    }
    return getSyncFilterSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PPublishFilterRequest,
      org.apache.doris.proto.InternalService.PPublishFilterResponse> getApplyFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "apply_filter",
      requestType = org.apache.doris.proto.InternalService.PPublishFilterRequest.class,
      responseType = org.apache.doris.proto.InternalService.PPublishFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PPublishFilterRequest,
      org.apache.doris.proto.InternalService.PPublishFilterResponse> getApplyFilterMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PPublishFilterRequest, org.apache.doris.proto.InternalService.PPublishFilterResponse> getApplyFilterMethod;
    if ((getApplyFilterMethod = PBackendServiceGrpc.getApplyFilterMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getApplyFilterMethod = PBackendServiceGrpc.getApplyFilterMethod) == null) {
          PBackendServiceGrpc.getApplyFilterMethod = getApplyFilterMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PPublishFilterRequest, org.apache.doris.proto.InternalService.PPublishFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "apply_filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PPublishFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PPublishFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("apply_filter"))
              .build();
        }
      }
    }
    return getApplyFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PPublishFilterRequestV2,
      org.apache.doris.proto.InternalService.PPublishFilterResponse> getApplyFilterv2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "apply_filterv2",
      requestType = org.apache.doris.proto.InternalService.PPublishFilterRequestV2.class,
      responseType = org.apache.doris.proto.InternalService.PPublishFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PPublishFilterRequestV2,
      org.apache.doris.proto.InternalService.PPublishFilterResponse> getApplyFilterv2Method() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PPublishFilterRequestV2, org.apache.doris.proto.InternalService.PPublishFilterResponse> getApplyFilterv2Method;
    if ((getApplyFilterv2Method = PBackendServiceGrpc.getApplyFilterv2Method) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getApplyFilterv2Method = PBackendServiceGrpc.getApplyFilterv2Method) == null) {
          PBackendServiceGrpc.getApplyFilterv2Method = getApplyFilterv2Method =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PPublishFilterRequestV2, org.apache.doris.proto.InternalService.PPublishFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "apply_filterv2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PPublishFilterRequestV2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PPublishFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("apply_filterv2"))
              .build();
        }
      }
    }
    return getApplyFilterv2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PConstantExprRequest,
      org.apache.doris.proto.InternalService.PConstantExprResult> getFoldConstantExprMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fold_constant_expr",
      requestType = org.apache.doris.proto.InternalService.PConstantExprRequest.class,
      responseType = org.apache.doris.proto.InternalService.PConstantExprResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PConstantExprRequest,
      org.apache.doris.proto.InternalService.PConstantExprResult> getFoldConstantExprMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PConstantExprRequest, org.apache.doris.proto.InternalService.PConstantExprResult> getFoldConstantExprMethod;
    if ((getFoldConstantExprMethod = PBackendServiceGrpc.getFoldConstantExprMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getFoldConstantExprMethod = PBackendServiceGrpc.getFoldConstantExprMethod) == null) {
          PBackendServiceGrpc.getFoldConstantExprMethod = getFoldConstantExprMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PConstantExprRequest, org.apache.doris.proto.InternalService.PConstantExprResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "fold_constant_expr"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PConstantExprRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PConstantExprResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("fold_constant_expr"))
              .build();
        }
      }
    }
    return getFoldConstantExprMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTransmitDataParams,
      org.apache.doris.proto.InternalService.PTransmitDataResult> getTransmitBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "transmit_block",
      requestType = org.apache.doris.proto.InternalService.PTransmitDataParams.class,
      responseType = org.apache.doris.proto.InternalService.PTransmitDataResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTransmitDataParams,
      org.apache.doris.proto.InternalService.PTransmitDataResult> getTransmitBlockMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTransmitDataParams, org.apache.doris.proto.InternalService.PTransmitDataResult> getTransmitBlockMethod;
    if ((getTransmitBlockMethod = PBackendServiceGrpc.getTransmitBlockMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getTransmitBlockMethod = PBackendServiceGrpc.getTransmitBlockMethod) == null) {
          PBackendServiceGrpc.getTransmitBlockMethod = getTransmitBlockMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PTransmitDataParams, org.apache.doris.proto.InternalService.PTransmitDataResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "transmit_block"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PTransmitDataParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PTransmitDataResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("transmit_block"))
              .build();
        }
      }
    }
    return getTransmitBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PEmptyRequest,
      org.apache.doris.proto.InternalService.PTransmitDataResult> getTransmitBlockByHttpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "transmit_block_by_http",
      requestType = org.apache.doris.proto.InternalService.PEmptyRequest.class,
      responseType = org.apache.doris.proto.InternalService.PTransmitDataResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PEmptyRequest,
      org.apache.doris.proto.InternalService.PTransmitDataResult> getTransmitBlockByHttpMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PEmptyRequest, org.apache.doris.proto.InternalService.PTransmitDataResult> getTransmitBlockByHttpMethod;
    if ((getTransmitBlockByHttpMethod = PBackendServiceGrpc.getTransmitBlockByHttpMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getTransmitBlockByHttpMethod = PBackendServiceGrpc.getTransmitBlockByHttpMethod) == null) {
          PBackendServiceGrpc.getTransmitBlockByHttpMethod = getTransmitBlockByHttpMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PEmptyRequest, org.apache.doris.proto.InternalService.PTransmitDataResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "transmit_block_by_http"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PEmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PTransmitDataResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("transmit_block_by_http"))
              .build();
        }
      }
    }
    return getTransmitBlockByHttpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PCheckRPCChannelRequest,
      org.apache.doris.proto.InternalService.PCheckRPCChannelResponse> getCheckRpcChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "check_rpc_channel",
      requestType = org.apache.doris.proto.InternalService.PCheckRPCChannelRequest.class,
      responseType = org.apache.doris.proto.InternalService.PCheckRPCChannelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PCheckRPCChannelRequest,
      org.apache.doris.proto.InternalService.PCheckRPCChannelResponse> getCheckRpcChannelMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PCheckRPCChannelRequest, org.apache.doris.proto.InternalService.PCheckRPCChannelResponse> getCheckRpcChannelMethod;
    if ((getCheckRpcChannelMethod = PBackendServiceGrpc.getCheckRpcChannelMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getCheckRpcChannelMethod = PBackendServiceGrpc.getCheckRpcChannelMethod) == null) {
          PBackendServiceGrpc.getCheckRpcChannelMethod = getCheckRpcChannelMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PCheckRPCChannelRequest, org.apache.doris.proto.InternalService.PCheckRPCChannelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "check_rpc_channel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PCheckRPCChannelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PCheckRPCChannelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("check_rpc_channel"))
              .build();
        }
      }
    }
    return getCheckRpcChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PResetRPCChannelRequest,
      org.apache.doris.proto.InternalService.PResetRPCChannelResponse> getResetRpcChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reset_rpc_channel",
      requestType = org.apache.doris.proto.InternalService.PResetRPCChannelRequest.class,
      responseType = org.apache.doris.proto.InternalService.PResetRPCChannelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PResetRPCChannelRequest,
      org.apache.doris.proto.InternalService.PResetRPCChannelResponse> getResetRpcChannelMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PResetRPCChannelRequest, org.apache.doris.proto.InternalService.PResetRPCChannelResponse> getResetRpcChannelMethod;
    if ((getResetRpcChannelMethod = PBackendServiceGrpc.getResetRpcChannelMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getResetRpcChannelMethod = PBackendServiceGrpc.getResetRpcChannelMethod) == null) {
          PBackendServiceGrpc.getResetRpcChannelMethod = getResetRpcChannelMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PResetRPCChannelRequest, org.apache.doris.proto.InternalService.PResetRPCChannelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "reset_rpc_channel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PResetRPCChannelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PResetRPCChannelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("reset_rpc_channel"))
              .build();
        }
      }
    }
    return getResetRpcChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.Types.PHandShakeRequest,
      org.apache.doris.proto.Types.PHandShakeResponse> getHandShakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hand_shake",
      requestType = org.apache.doris.proto.Types.PHandShakeRequest.class,
      responseType = org.apache.doris.proto.Types.PHandShakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.Types.PHandShakeRequest,
      org.apache.doris.proto.Types.PHandShakeResponse> getHandShakeMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.Types.PHandShakeRequest, org.apache.doris.proto.Types.PHandShakeResponse> getHandShakeMethod;
    if ((getHandShakeMethod = PBackendServiceGrpc.getHandShakeMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getHandShakeMethod = PBackendServiceGrpc.getHandShakeMethod) == null) {
          PBackendServiceGrpc.getHandShakeMethod = getHandShakeMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.Types.PHandShakeRequest, org.apache.doris.proto.Types.PHandShakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hand_shake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.Types.PHandShakeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.Types.PHandShakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("hand_shake"))
              .build();
        }
      }
    }
    return getHandShakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTabletWriteSlaveRequest,
      org.apache.doris.proto.InternalService.PTabletWriteSlaveResult> getRequestSlaveTabletPullRowsetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "request_slave_tablet_pull_rowset",
      requestType = org.apache.doris.proto.InternalService.PTabletWriteSlaveRequest.class,
      responseType = org.apache.doris.proto.InternalService.PTabletWriteSlaveResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTabletWriteSlaveRequest,
      org.apache.doris.proto.InternalService.PTabletWriteSlaveResult> getRequestSlaveTabletPullRowsetMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTabletWriteSlaveRequest, org.apache.doris.proto.InternalService.PTabletWriteSlaveResult> getRequestSlaveTabletPullRowsetMethod;
    if ((getRequestSlaveTabletPullRowsetMethod = PBackendServiceGrpc.getRequestSlaveTabletPullRowsetMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getRequestSlaveTabletPullRowsetMethod = PBackendServiceGrpc.getRequestSlaveTabletPullRowsetMethod) == null) {
          PBackendServiceGrpc.getRequestSlaveTabletPullRowsetMethod = getRequestSlaveTabletPullRowsetMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PTabletWriteSlaveRequest, org.apache.doris.proto.InternalService.PTabletWriteSlaveResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "request_slave_tablet_pull_rowset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PTabletWriteSlaveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PTabletWriteSlaveResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("request_slave_tablet_pull_rowset"))
              .build();
        }
      }
    }
    return getRequestSlaveTabletPullRowsetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneRequest,
      org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneResult> getResponseSlaveTabletPullRowsetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "response_slave_tablet_pull_rowset",
      requestType = org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneRequest.class,
      responseType = org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneRequest,
      org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneResult> getResponseSlaveTabletPullRowsetMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneRequest, org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneResult> getResponseSlaveTabletPullRowsetMethod;
    if ((getResponseSlaveTabletPullRowsetMethod = PBackendServiceGrpc.getResponseSlaveTabletPullRowsetMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getResponseSlaveTabletPullRowsetMethod = PBackendServiceGrpc.getResponseSlaveTabletPullRowsetMethod) == null) {
          PBackendServiceGrpc.getResponseSlaveTabletPullRowsetMethod = getResponseSlaveTabletPullRowsetMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneRequest, org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "response_slave_tablet_pull_rowset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("response_slave_tablet_pull_rowset"))
              .build();
        }
      }
    }
    return getResponseSlaveTabletPullRowsetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.POutfileWriteSuccessRequest,
      org.apache.doris.proto.InternalService.POutfileWriteSuccessResult> getOutfileWriteSuccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "outfile_write_success",
      requestType = org.apache.doris.proto.InternalService.POutfileWriteSuccessRequest.class,
      responseType = org.apache.doris.proto.InternalService.POutfileWriteSuccessResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.POutfileWriteSuccessRequest,
      org.apache.doris.proto.InternalService.POutfileWriteSuccessResult> getOutfileWriteSuccessMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.POutfileWriteSuccessRequest, org.apache.doris.proto.InternalService.POutfileWriteSuccessResult> getOutfileWriteSuccessMethod;
    if ((getOutfileWriteSuccessMethod = PBackendServiceGrpc.getOutfileWriteSuccessMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getOutfileWriteSuccessMethod = PBackendServiceGrpc.getOutfileWriteSuccessMethod) == null) {
          PBackendServiceGrpc.getOutfileWriteSuccessMethod = getOutfileWriteSuccessMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.POutfileWriteSuccessRequest, org.apache.doris.proto.InternalService.POutfileWriteSuccessResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "outfile_write_success"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.POutfileWriteSuccessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.POutfileWriteSuccessResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("outfile_write_success"))
              .build();
        }
      }
    }
    return getOutfileWriteSuccessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PFetchTableSchemaRequest,
      org.apache.doris.proto.InternalService.PFetchTableSchemaResult> getFetchTableSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fetch_table_schema",
      requestType = org.apache.doris.proto.InternalService.PFetchTableSchemaRequest.class,
      responseType = org.apache.doris.proto.InternalService.PFetchTableSchemaResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PFetchTableSchemaRequest,
      org.apache.doris.proto.InternalService.PFetchTableSchemaResult> getFetchTableSchemaMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PFetchTableSchemaRequest, org.apache.doris.proto.InternalService.PFetchTableSchemaResult> getFetchTableSchemaMethod;
    if ((getFetchTableSchemaMethod = PBackendServiceGrpc.getFetchTableSchemaMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getFetchTableSchemaMethod = PBackendServiceGrpc.getFetchTableSchemaMethod) == null) {
          PBackendServiceGrpc.getFetchTableSchemaMethod = getFetchTableSchemaMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PFetchTableSchemaRequest, org.apache.doris.proto.InternalService.PFetchTableSchemaResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "fetch_table_schema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PFetchTableSchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PFetchTableSchemaResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("fetch_table_schema"))
              .build();
        }
      }
    }
    return getFetchTableSchemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PMultiGetRequest,
      org.apache.doris.proto.InternalService.PMultiGetResponse> getMultigetDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "multiget_data",
      requestType = org.apache.doris.proto.InternalService.PMultiGetRequest.class,
      responseType = org.apache.doris.proto.InternalService.PMultiGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PMultiGetRequest,
      org.apache.doris.proto.InternalService.PMultiGetResponse> getMultigetDataMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PMultiGetRequest, org.apache.doris.proto.InternalService.PMultiGetResponse> getMultigetDataMethod;
    if ((getMultigetDataMethod = PBackendServiceGrpc.getMultigetDataMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getMultigetDataMethod = PBackendServiceGrpc.getMultigetDataMethod) == null) {
          PBackendServiceGrpc.getMultigetDataMethod = getMultigetDataMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PMultiGetRequest, org.apache.doris.proto.InternalService.PMultiGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "multiget_data"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PMultiGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PMultiGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("multiget_data"))
              .build();
        }
      }
    }
    return getMultigetDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTabletKeyLookupRequest,
      org.apache.doris.proto.InternalService.PTabletKeyLookupResponse> getTabletFetchDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "tablet_fetch_data",
      requestType = org.apache.doris.proto.InternalService.PTabletKeyLookupRequest.class,
      responseType = org.apache.doris.proto.InternalService.PTabletKeyLookupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTabletKeyLookupRequest,
      org.apache.doris.proto.InternalService.PTabletKeyLookupResponse> getTabletFetchDataMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PTabletKeyLookupRequest, org.apache.doris.proto.InternalService.PTabletKeyLookupResponse> getTabletFetchDataMethod;
    if ((getTabletFetchDataMethod = PBackendServiceGrpc.getTabletFetchDataMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getTabletFetchDataMethod = PBackendServiceGrpc.getTabletFetchDataMethod) == null) {
          PBackendServiceGrpc.getTabletFetchDataMethod = getTabletFetchDataMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PTabletKeyLookupRequest, org.apache.doris.proto.InternalService.PTabletKeyLookupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "tablet_fetch_data"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PTabletKeyLookupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PTabletKeyLookupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("tablet_fetch_data"))
              .build();
        }
      }
    }
    return getTabletFetchDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PFetchColIdsRequest,
      org.apache.doris.proto.InternalService.PFetchColIdsResponse> getGetColumnIdsByTabletIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get_column_ids_by_tablet_ids",
      requestType = org.apache.doris.proto.InternalService.PFetchColIdsRequest.class,
      responseType = org.apache.doris.proto.InternalService.PFetchColIdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PFetchColIdsRequest,
      org.apache.doris.proto.InternalService.PFetchColIdsResponse> getGetColumnIdsByTabletIdsMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PFetchColIdsRequest, org.apache.doris.proto.InternalService.PFetchColIdsResponse> getGetColumnIdsByTabletIdsMethod;
    if ((getGetColumnIdsByTabletIdsMethod = PBackendServiceGrpc.getGetColumnIdsByTabletIdsMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getGetColumnIdsByTabletIdsMethod = PBackendServiceGrpc.getGetColumnIdsByTabletIdsMethod) == null) {
          PBackendServiceGrpc.getGetColumnIdsByTabletIdsMethod = getGetColumnIdsByTabletIdsMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PFetchColIdsRequest, org.apache.doris.proto.InternalService.PFetchColIdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get_column_ids_by_tablet_ids"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PFetchColIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PFetchColIdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("get_column_ids_by_tablet_ids"))
              .build();
        }
      }
    }
    return getGetColumnIdsByTabletIdsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PGetTabletVersionsRequest,
      org.apache.doris.proto.InternalService.PGetTabletVersionsResponse> getGetTabletRowsetVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get_tablet_rowset_versions",
      requestType = org.apache.doris.proto.InternalService.PGetTabletVersionsRequest.class,
      responseType = org.apache.doris.proto.InternalService.PGetTabletVersionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PGetTabletVersionsRequest,
      org.apache.doris.proto.InternalService.PGetTabletVersionsResponse> getGetTabletRowsetVersionsMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PGetTabletVersionsRequest, org.apache.doris.proto.InternalService.PGetTabletVersionsResponse> getGetTabletRowsetVersionsMethod;
    if ((getGetTabletRowsetVersionsMethod = PBackendServiceGrpc.getGetTabletRowsetVersionsMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getGetTabletRowsetVersionsMethod = PBackendServiceGrpc.getGetTabletRowsetVersionsMethod) == null) {
          PBackendServiceGrpc.getGetTabletRowsetVersionsMethod = getGetTabletRowsetVersionsMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PGetTabletVersionsRequest, org.apache.doris.proto.InternalService.PGetTabletVersionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get_tablet_rowset_versions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PGetTabletVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PGetTabletVersionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("get_tablet_rowset_versions"))
              .build();
        }
      }
    }
    return getGetTabletRowsetVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PReportStreamLoadStatusRequest,
      org.apache.doris.proto.InternalService.PReportStreamLoadStatusResponse> getReportStreamLoadStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "report_stream_load_status",
      requestType = org.apache.doris.proto.InternalService.PReportStreamLoadStatusRequest.class,
      responseType = org.apache.doris.proto.InternalService.PReportStreamLoadStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PReportStreamLoadStatusRequest,
      org.apache.doris.proto.InternalService.PReportStreamLoadStatusResponse> getReportStreamLoadStatusMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PReportStreamLoadStatusRequest, org.apache.doris.proto.InternalService.PReportStreamLoadStatusResponse> getReportStreamLoadStatusMethod;
    if ((getReportStreamLoadStatusMethod = PBackendServiceGrpc.getReportStreamLoadStatusMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getReportStreamLoadStatusMethod = PBackendServiceGrpc.getReportStreamLoadStatusMethod) == null) {
          PBackendServiceGrpc.getReportStreamLoadStatusMethod = getReportStreamLoadStatusMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PReportStreamLoadStatusRequest, org.apache.doris.proto.InternalService.PReportStreamLoadStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "report_stream_load_status"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PReportStreamLoadStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PReportStreamLoadStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("report_stream_load_status"))
              .build();
        }
      }
    }
    return getReportStreamLoadStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PGlobRequest,
      org.apache.doris.proto.InternalService.PGlobResponse> getGlobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "glob",
      requestType = org.apache.doris.proto.InternalService.PGlobRequest.class,
      responseType = org.apache.doris.proto.InternalService.PGlobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PGlobRequest,
      org.apache.doris.proto.InternalService.PGlobResponse> getGlobMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PGlobRequest, org.apache.doris.proto.InternalService.PGlobResponse> getGlobMethod;
    if ((getGlobMethod = PBackendServiceGrpc.getGlobMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getGlobMethod = PBackendServiceGrpc.getGlobMethod) == null) {
          PBackendServiceGrpc.getGlobMethod = getGlobMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PGlobRequest, org.apache.doris.proto.InternalService.PGlobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "glob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PGlobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PGlobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("glob"))
              .build();
        }
      }
    }
    return getGlobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PGroupCommitInsertRequest,
      org.apache.doris.proto.InternalService.PGroupCommitInsertResponse> getGroupCommitInsertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "group_commit_insert",
      requestType = org.apache.doris.proto.InternalService.PGroupCommitInsertRequest.class,
      responseType = org.apache.doris.proto.InternalService.PGroupCommitInsertResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PGroupCommitInsertRequest,
      org.apache.doris.proto.InternalService.PGroupCommitInsertResponse> getGroupCommitInsertMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PGroupCommitInsertRequest, org.apache.doris.proto.InternalService.PGroupCommitInsertResponse> getGroupCommitInsertMethod;
    if ((getGroupCommitInsertMethod = PBackendServiceGrpc.getGroupCommitInsertMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getGroupCommitInsertMethod = PBackendServiceGrpc.getGroupCommitInsertMethod) == null) {
          PBackendServiceGrpc.getGroupCommitInsertMethod = getGroupCommitInsertMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PGroupCommitInsertRequest, org.apache.doris.proto.InternalService.PGroupCommitInsertResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "group_commit_insert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PGroupCommitInsertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PGroupCommitInsertResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("group_commit_insert"))
              .build();
        }
      }
    }
    return getGroupCommitInsertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PGetWalQueueSizeRequest,
      org.apache.doris.proto.InternalService.PGetWalQueueSizeResponse> getGetWalQueueSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get_wal_queue_size",
      requestType = org.apache.doris.proto.InternalService.PGetWalQueueSizeRequest.class,
      responseType = org.apache.doris.proto.InternalService.PGetWalQueueSizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PGetWalQueueSizeRequest,
      org.apache.doris.proto.InternalService.PGetWalQueueSizeResponse> getGetWalQueueSizeMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PGetWalQueueSizeRequest, org.apache.doris.proto.InternalService.PGetWalQueueSizeResponse> getGetWalQueueSizeMethod;
    if ((getGetWalQueueSizeMethod = PBackendServiceGrpc.getGetWalQueueSizeMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getGetWalQueueSizeMethod = PBackendServiceGrpc.getGetWalQueueSizeMethod) == null) {
          PBackendServiceGrpc.getGetWalQueueSizeMethod = getGetWalQueueSizeMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PGetWalQueueSizeRequest, org.apache.doris.proto.InternalService.PGetWalQueueSizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get_wal_queue_size"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PGetWalQueueSizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PGetWalQueueSizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("get_wal_queue_size"))
              .build();
        }
      }
    }
    return getGetWalQueueSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaRequest,
      org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaResult> getFetchArrowFlightSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fetch_arrow_flight_schema",
      requestType = org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaRequest.class,
      responseType = org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaRequest,
      org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaResult> getFetchArrowFlightSchemaMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaRequest, org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaResult> getFetchArrowFlightSchemaMethod;
    if ((getFetchArrowFlightSchemaMethod = PBackendServiceGrpc.getFetchArrowFlightSchemaMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getFetchArrowFlightSchemaMethod = PBackendServiceGrpc.getFetchArrowFlightSchemaMethod) == null) {
          PBackendServiceGrpc.getFetchArrowFlightSchemaMethod = getFetchArrowFlightSchemaMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaRequest, org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "fetch_arrow_flight_schema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("fetch_arrow_flight_schema"))
              .build();
        }
      }
    }
    return getFetchArrowFlightSchemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PFetchRemoteSchemaRequest,
      org.apache.doris.proto.InternalService.PFetchRemoteSchemaResponse> getFetchRemoteTabletSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fetch_remote_tablet_schema",
      requestType = org.apache.doris.proto.InternalService.PFetchRemoteSchemaRequest.class,
      responseType = org.apache.doris.proto.InternalService.PFetchRemoteSchemaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PFetchRemoteSchemaRequest,
      org.apache.doris.proto.InternalService.PFetchRemoteSchemaResponse> getFetchRemoteTabletSchemaMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PFetchRemoteSchemaRequest, org.apache.doris.proto.InternalService.PFetchRemoteSchemaResponse> getFetchRemoteTabletSchemaMethod;
    if ((getFetchRemoteTabletSchemaMethod = PBackendServiceGrpc.getFetchRemoteTabletSchemaMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getFetchRemoteTabletSchemaMethod = PBackendServiceGrpc.getFetchRemoteTabletSchemaMethod) == null) {
          PBackendServiceGrpc.getFetchRemoteTabletSchemaMethod = getFetchRemoteTabletSchemaMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PFetchRemoteSchemaRequest, org.apache.doris.proto.InternalService.PFetchRemoteSchemaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "fetch_remote_tablet_schema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PFetchRemoteSchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PFetchRemoteSchemaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("fetch_remote_tablet_schema"))
              .build();
        }
      }
    }
    return getFetchRemoteTabletSchemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PJdbcTestConnectionRequest,
      org.apache.doris.proto.InternalService.PJdbcTestConnectionResult> getTestJdbcConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "test_jdbc_connection",
      requestType = org.apache.doris.proto.InternalService.PJdbcTestConnectionRequest.class,
      responseType = org.apache.doris.proto.InternalService.PJdbcTestConnectionResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PJdbcTestConnectionRequest,
      org.apache.doris.proto.InternalService.PJdbcTestConnectionResult> getTestJdbcConnectionMethod() {
    io.grpc.MethodDescriptor<org.apache.doris.proto.InternalService.PJdbcTestConnectionRequest, org.apache.doris.proto.InternalService.PJdbcTestConnectionResult> getTestJdbcConnectionMethod;
    if ((getTestJdbcConnectionMethod = PBackendServiceGrpc.getTestJdbcConnectionMethod) == null) {
      synchronized (PBackendServiceGrpc.class) {
        if ((getTestJdbcConnectionMethod = PBackendServiceGrpc.getTestJdbcConnectionMethod) == null) {
          PBackendServiceGrpc.getTestJdbcConnectionMethod = getTestJdbcConnectionMethod =
              io.grpc.MethodDescriptor.<org.apache.doris.proto.InternalService.PJdbcTestConnectionRequest, org.apache.doris.proto.InternalService.PJdbcTestConnectionResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "test_jdbc_connection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PJdbcTestConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.doris.proto.InternalService.PJdbcTestConnectionResult.getDefaultInstance()))
              .setSchemaDescriptor(new PBackendServiceMethodDescriptorSupplier("test_jdbc_connection"))
              .build();
        }
      }
    }
    return getTestJdbcConnectionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PBackendServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PBackendServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PBackendServiceStub>() {
        @java.lang.Override
        public PBackendServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PBackendServiceStub(channel, callOptions);
        }
      };
    return PBackendServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PBackendServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PBackendServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PBackendServiceBlockingStub>() {
        @java.lang.Override
        public PBackendServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PBackendServiceBlockingStub(channel, callOptions);
        }
      };
    return PBackendServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PBackendServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PBackendServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PBackendServiceFutureStub>() {
        @java.lang.Override
        public PBackendServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PBackendServiceFutureStub(channel, callOptions);
        }
      };
    return PBackendServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PBackendServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void transmitData(org.apache.doris.proto.InternalService.PTransmitDataParams request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTransmitDataResult> responseObserver) {
      asyncUnimplementedUnaryCall(getTransmitDataMethod(), responseObserver);
    }

    /**
     */
    public void transmitDataByHttp(org.apache.doris.proto.InternalService.PEmptyRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTransmitDataResult> responseObserver) {
      asyncUnimplementedUnaryCall(getTransmitDataByHttpMethod(), responseObserver);
    }

    /**
     * <pre>
     * If #fragments of a query is &lt; 3, use exec_plan_fragment directly.
     * If #fragments of a query is &gt;=3, use exec_plan_fragment_prepare + exec_plan_fragment_start
     * </pre>
     */
    public void execPlanFragment(org.apache.doris.proto.InternalService.PExecPlanFragmentRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PExecPlanFragmentResult> responseObserver) {
      asyncUnimplementedUnaryCall(getExecPlanFragmentMethod(), responseObserver);
    }

    /**
     */
    public void execPlanFragmentPrepare(org.apache.doris.proto.InternalService.PExecPlanFragmentRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PExecPlanFragmentResult> responseObserver) {
      asyncUnimplementedUnaryCall(getExecPlanFragmentPrepareMethod(), responseObserver);
    }

    /**
     */
    public void execPlanFragmentStart(org.apache.doris.proto.InternalService.PExecPlanFragmentStartRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PExecPlanFragmentResult> responseObserver) {
      asyncUnimplementedUnaryCall(getExecPlanFragmentStartMethod(), responseObserver);
    }

    /**
     */
    public void cancelPlanFragment(org.apache.doris.proto.InternalService.PCancelPlanFragmentRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PCancelPlanFragmentResult> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelPlanFragmentMethod(), responseObserver);
    }

    /**
     */
    public void fetchData(org.apache.doris.proto.InternalService.PFetchDataRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PFetchDataResult> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchDataMethod(), responseObserver);
    }

    /**
     */
    public void tabletWriterOpen(org.apache.doris.proto.InternalService.PTabletWriterOpenRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTabletWriterOpenResult> responseObserver) {
      asyncUnimplementedUnaryCall(getTabletWriterOpenMethod(), responseObserver);
    }

    /**
     */
    public void openLoadStream(org.apache.doris.proto.InternalService.POpenLoadStreamRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.POpenLoadStreamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOpenLoadStreamMethod(), responseObserver);
    }

    /**
     */
    public void tabletWriterAddBlock(org.apache.doris.proto.InternalService.PTabletWriterAddBlockRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult> responseObserver) {
      asyncUnimplementedUnaryCall(getTabletWriterAddBlockMethod(), responseObserver);
    }

    /**
     */
    public void tabletWriterAddBlockByHttp(org.apache.doris.proto.InternalService.PEmptyRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult> responseObserver) {
      asyncUnimplementedUnaryCall(getTabletWriterAddBlockByHttpMethod(), responseObserver);
    }

    /**
     */
    public void tabletWriterCancel(org.apache.doris.proto.InternalService.PTabletWriterCancelRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTabletWriterCancelResult> responseObserver) {
      asyncUnimplementedUnaryCall(getTabletWriterCancelMethod(), responseObserver);
    }

    /**
     */
    public void getInfo(org.apache.doris.proto.InternalService.PProxyRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PProxyResult> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInfoMethod(), responseObserver);
    }

    /**
     */
    public void updateCache(org.apache.doris.proto.InternalService.PUpdateCacheRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PCacheResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCacheMethod(), responseObserver);
    }

    /**
     */
    public void fetchCache(org.apache.doris.proto.InternalService.PFetchCacheRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PFetchCacheResult> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchCacheMethod(), responseObserver);
    }

    /**
     */
    public void clearCache(org.apache.doris.proto.InternalService.PClearCacheRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PCacheResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClearCacheMethod(), responseObserver);
    }

    /**
     */
    public void sendData(org.apache.doris.proto.InternalService.PSendDataRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PSendDataResult> responseObserver) {
      asyncUnimplementedUnaryCall(getSendDataMethod(), responseObserver);
    }

    /**
     */
    public void commit(org.apache.doris.proto.InternalService.PCommitRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PCommitResult> responseObserver) {
      asyncUnimplementedUnaryCall(getCommitMethod(), responseObserver);
    }

    /**
     */
    public void rollback(org.apache.doris.proto.InternalService.PRollbackRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PRollbackResult> responseObserver) {
      asyncUnimplementedUnaryCall(getRollbackMethod(), responseObserver);
    }

    /**
     */
    public void mergeFilter(org.apache.doris.proto.InternalService.PMergeFilterRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PMergeFilterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMergeFilterMethod(), responseObserver);
    }

    /**
     */
    public void sendFilterSize(org.apache.doris.proto.InternalService.PSendFilterSizeRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PSendFilterSizeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendFilterSizeMethod(), responseObserver);
    }

    /**
     */
    public void syncFilterSize(org.apache.doris.proto.InternalService.PSyncFilterSizeRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PSyncFilterSizeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSyncFilterSizeMethod(), responseObserver);
    }

    /**
     */
    public void applyFilter(org.apache.doris.proto.InternalService.PPublishFilterRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PPublishFilterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getApplyFilterMethod(), responseObserver);
    }

    /**
     */
    public void applyFilterv2(org.apache.doris.proto.InternalService.PPublishFilterRequestV2 request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PPublishFilterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getApplyFilterv2Method(), responseObserver);
    }

    /**
     */
    public void foldConstantExpr(org.apache.doris.proto.InternalService.PConstantExprRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PConstantExprResult> responseObserver) {
      asyncUnimplementedUnaryCall(getFoldConstantExprMethod(), responseObserver);
    }

    /**
     */
    public void transmitBlock(org.apache.doris.proto.InternalService.PTransmitDataParams request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTransmitDataResult> responseObserver) {
      asyncUnimplementedUnaryCall(getTransmitBlockMethod(), responseObserver);
    }

    /**
     */
    public void transmitBlockByHttp(org.apache.doris.proto.InternalService.PEmptyRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTransmitDataResult> responseObserver) {
      asyncUnimplementedUnaryCall(getTransmitBlockByHttpMethod(), responseObserver);
    }

    /**
     */
    public void checkRpcChannel(org.apache.doris.proto.InternalService.PCheckRPCChannelRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PCheckRPCChannelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckRpcChannelMethod(), responseObserver);
    }

    /**
     */
    public void resetRpcChannel(org.apache.doris.proto.InternalService.PResetRPCChannelRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PResetRPCChannelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getResetRpcChannelMethod(), responseObserver);
    }

    /**
     */
    public void handShake(org.apache.doris.proto.Types.PHandShakeRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.Types.PHandShakeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHandShakeMethod(), responseObserver);
    }

    /**
     */
    public void requestSlaveTabletPullRowset(org.apache.doris.proto.InternalService.PTabletWriteSlaveRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTabletWriteSlaveResult> responseObserver) {
      asyncUnimplementedUnaryCall(getRequestSlaveTabletPullRowsetMethod(), responseObserver);
    }

    /**
     */
    public void responseSlaveTabletPullRowset(org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneResult> responseObserver) {
      asyncUnimplementedUnaryCall(getResponseSlaveTabletPullRowsetMethod(), responseObserver);
    }

    /**
     */
    public void outfileWriteSuccess(org.apache.doris.proto.InternalService.POutfileWriteSuccessRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.POutfileWriteSuccessResult> responseObserver) {
      asyncUnimplementedUnaryCall(getOutfileWriteSuccessMethod(), responseObserver);
    }

    /**
     */
    public void fetchTableSchema(org.apache.doris.proto.InternalService.PFetchTableSchemaRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PFetchTableSchemaResult> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchTableSchemaMethod(), responseObserver);
    }

    /**
     */
    public void multigetData(org.apache.doris.proto.InternalService.PMultiGetRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PMultiGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMultigetDataMethod(), responseObserver);
    }

    /**
     */
    public void tabletFetchData(org.apache.doris.proto.InternalService.PTabletKeyLookupRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTabletKeyLookupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTabletFetchDataMethod(), responseObserver);
    }

    /**
     */
    public void getColumnIdsByTabletIds(org.apache.doris.proto.InternalService.PFetchColIdsRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PFetchColIdsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetColumnIdsByTabletIdsMethod(), responseObserver);
    }

    /**
     */
    public void getTabletRowsetVersions(org.apache.doris.proto.InternalService.PGetTabletVersionsRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PGetTabletVersionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTabletRowsetVersionsMethod(), responseObserver);
    }

    /**
     */
    public void reportStreamLoadStatus(org.apache.doris.proto.InternalService.PReportStreamLoadStatusRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PReportStreamLoadStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReportStreamLoadStatusMethod(), responseObserver);
    }

    /**
     */
    public void glob(org.apache.doris.proto.InternalService.PGlobRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PGlobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGlobMethod(), responseObserver);
    }

    /**
     */
    public void groupCommitInsert(org.apache.doris.proto.InternalService.PGroupCommitInsertRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PGroupCommitInsertResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGroupCommitInsertMethod(), responseObserver);
    }

    /**
     */
    public void getWalQueueSize(org.apache.doris.proto.InternalService.PGetWalQueueSizeRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PGetWalQueueSizeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWalQueueSizeMethod(), responseObserver);
    }

    /**
     */
    public void fetchArrowFlightSchema(org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaResult> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchArrowFlightSchemaMethod(), responseObserver);
    }

    /**
     */
    public void fetchRemoteTabletSchema(org.apache.doris.proto.InternalService.PFetchRemoteSchemaRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PFetchRemoteSchemaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchRemoteTabletSchemaMethod(), responseObserver);
    }

    /**
     */
    public void testJdbcConnection(org.apache.doris.proto.InternalService.PJdbcTestConnectionRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PJdbcTestConnectionResult> responseObserver) {
      asyncUnimplementedUnaryCall(getTestJdbcConnectionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTransmitDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PTransmitDataParams,
                org.apache.doris.proto.InternalService.PTransmitDataResult>(
                  this, METHODID_TRANSMIT_DATA)))
          .addMethod(
            getTransmitDataByHttpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PEmptyRequest,
                org.apache.doris.proto.InternalService.PTransmitDataResult>(
                  this, METHODID_TRANSMIT_DATA_BY_HTTP)))
          .addMethod(
            getExecPlanFragmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PExecPlanFragmentRequest,
                org.apache.doris.proto.InternalService.PExecPlanFragmentResult>(
                  this, METHODID_EXEC_PLAN_FRAGMENT)))
          .addMethod(
            getExecPlanFragmentPrepareMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PExecPlanFragmentRequest,
                org.apache.doris.proto.InternalService.PExecPlanFragmentResult>(
                  this, METHODID_EXEC_PLAN_FRAGMENT_PREPARE)))
          .addMethod(
            getExecPlanFragmentStartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PExecPlanFragmentStartRequest,
                org.apache.doris.proto.InternalService.PExecPlanFragmentResult>(
                  this, METHODID_EXEC_PLAN_FRAGMENT_START)))
          .addMethod(
            getCancelPlanFragmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PCancelPlanFragmentRequest,
                org.apache.doris.proto.InternalService.PCancelPlanFragmentResult>(
                  this, METHODID_CANCEL_PLAN_FRAGMENT)))
          .addMethod(
            getFetchDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PFetchDataRequest,
                org.apache.doris.proto.InternalService.PFetchDataResult>(
                  this, METHODID_FETCH_DATA)))
          .addMethod(
            getTabletWriterOpenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PTabletWriterOpenRequest,
                org.apache.doris.proto.InternalService.PTabletWriterOpenResult>(
                  this, METHODID_TABLET_WRITER_OPEN)))
          .addMethod(
            getOpenLoadStreamMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.POpenLoadStreamRequest,
                org.apache.doris.proto.InternalService.POpenLoadStreamResponse>(
                  this, METHODID_OPEN_LOAD_STREAM)))
          .addMethod(
            getTabletWriterAddBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PTabletWriterAddBlockRequest,
                org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult>(
                  this, METHODID_TABLET_WRITER_ADD_BLOCK)))
          .addMethod(
            getTabletWriterAddBlockByHttpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PEmptyRequest,
                org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult>(
                  this, METHODID_TABLET_WRITER_ADD_BLOCK_BY_HTTP)))
          .addMethod(
            getTabletWriterCancelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PTabletWriterCancelRequest,
                org.apache.doris.proto.InternalService.PTabletWriterCancelResult>(
                  this, METHODID_TABLET_WRITER_CANCEL)))
          .addMethod(
            getGetInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PProxyRequest,
                org.apache.doris.proto.InternalService.PProxyResult>(
                  this, METHODID_GET_INFO)))
          .addMethod(
            getUpdateCacheMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PUpdateCacheRequest,
                org.apache.doris.proto.InternalService.PCacheResponse>(
                  this, METHODID_UPDATE_CACHE)))
          .addMethod(
            getFetchCacheMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PFetchCacheRequest,
                org.apache.doris.proto.InternalService.PFetchCacheResult>(
                  this, METHODID_FETCH_CACHE)))
          .addMethod(
            getClearCacheMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PClearCacheRequest,
                org.apache.doris.proto.InternalService.PCacheResponse>(
                  this, METHODID_CLEAR_CACHE)))
          .addMethod(
            getSendDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PSendDataRequest,
                org.apache.doris.proto.InternalService.PSendDataResult>(
                  this, METHODID_SEND_DATA)))
          .addMethod(
            getCommitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PCommitRequest,
                org.apache.doris.proto.InternalService.PCommitResult>(
                  this, METHODID_COMMIT)))
          .addMethod(
            getRollbackMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PRollbackRequest,
                org.apache.doris.proto.InternalService.PRollbackResult>(
                  this, METHODID_ROLLBACK)))
          .addMethod(
            getMergeFilterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PMergeFilterRequest,
                org.apache.doris.proto.InternalService.PMergeFilterResponse>(
                  this, METHODID_MERGE_FILTER)))
          .addMethod(
            getSendFilterSizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PSendFilterSizeRequest,
                org.apache.doris.proto.InternalService.PSendFilterSizeResponse>(
                  this, METHODID_SEND_FILTER_SIZE)))
          .addMethod(
            getSyncFilterSizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PSyncFilterSizeRequest,
                org.apache.doris.proto.InternalService.PSyncFilterSizeResponse>(
                  this, METHODID_SYNC_FILTER_SIZE)))
          .addMethod(
            getApplyFilterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PPublishFilterRequest,
                org.apache.doris.proto.InternalService.PPublishFilterResponse>(
                  this, METHODID_APPLY_FILTER)))
          .addMethod(
            getApplyFilterv2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PPublishFilterRequestV2,
                org.apache.doris.proto.InternalService.PPublishFilterResponse>(
                  this, METHODID_APPLY_FILTERV2)))
          .addMethod(
            getFoldConstantExprMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PConstantExprRequest,
                org.apache.doris.proto.InternalService.PConstantExprResult>(
                  this, METHODID_FOLD_CONSTANT_EXPR)))
          .addMethod(
            getTransmitBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PTransmitDataParams,
                org.apache.doris.proto.InternalService.PTransmitDataResult>(
                  this, METHODID_TRANSMIT_BLOCK)))
          .addMethod(
            getTransmitBlockByHttpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PEmptyRequest,
                org.apache.doris.proto.InternalService.PTransmitDataResult>(
                  this, METHODID_TRANSMIT_BLOCK_BY_HTTP)))
          .addMethod(
            getCheckRpcChannelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PCheckRPCChannelRequest,
                org.apache.doris.proto.InternalService.PCheckRPCChannelResponse>(
                  this, METHODID_CHECK_RPC_CHANNEL)))
          .addMethod(
            getResetRpcChannelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PResetRPCChannelRequest,
                org.apache.doris.proto.InternalService.PResetRPCChannelResponse>(
                  this, METHODID_RESET_RPC_CHANNEL)))
          .addMethod(
            getHandShakeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.Types.PHandShakeRequest,
                org.apache.doris.proto.Types.PHandShakeResponse>(
                  this, METHODID_HAND_SHAKE)))
          .addMethod(
            getRequestSlaveTabletPullRowsetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PTabletWriteSlaveRequest,
                org.apache.doris.proto.InternalService.PTabletWriteSlaveResult>(
                  this, METHODID_REQUEST_SLAVE_TABLET_PULL_ROWSET)))
          .addMethod(
            getResponseSlaveTabletPullRowsetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneRequest,
                org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneResult>(
                  this, METHODID_RESPONSE_SLAVE_TABLET_PULL_ROWSET)))
          .addMethod(
            getOutfileWriteSuccessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.POutfileWriteSuccessRequest,
                org.apache.doris.proto.InternalService.POutfileWriteSuccessResult>(
                  this, METHODID_OUTFILE_WRITE_SUCCESS)))
          .addMethod(
            getFetchTableSchemaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PFetchTableSchemaRequest,
                org.apache.doris.proto.InternalService.PFetchTableSchemaResult>(
                  this, METHODID_FETCH_TABLE_SCHEMA)))
          .addMethod(
            getMultigetDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PMultiGetRequest,
                org.apache.doris.proto.InternalService.PMultiGetResponse>(
                  this, METHODID_MULTIGET_DATA)))
          .addMethod(
            getTabletFetchDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PTabletKeyLookupRequest,
                org.apache.doris.proto.InternalService.PTabletKeyLookupResponse>(
                  this, METHODID_TABLET_FETCH_DATA)))
          .addMethod(
            getGetColumnIdsByTabletIdsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PFetchColIdsRequest,
                org.apache.doris.proto.InternalService.PFetchColIdsResponse>(
                  this, METHODID_GET_COLUMN_IDS_BY_TABLET_IDS)))
          .addMethod(
            getGetTabletRowsetVersionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PGetTabletVersionsRequest,
                org.apache.doris.proto.InternalService.PGetTabletVersionsResponse>(
                  this, METHODID_GET_TABLET_ROWSET_VERSIONS)))
          .addMethod(
            getReportStreamLoadStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PReportStreamLoadStatusRequest,
                org.apache.doris.proto.InternalService.PReportStreamLoadStatusResponse>(
                  this, METHODID_REPORT_STREAM_LOAD_STATUS)))
          .addMethod(
            getGlobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PGlobRequest,
                org.apache.doris.proto.InternalService.PGlobResponse>(
                  this, METHODID_GLOB)))
          .addMethod(
            getGroupCommitInsertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PGroupCommitInsertRequest,
                org.apache.doris.proto.InternalService.PGroupCommitInsertResponse>(
                  this, METHODID_GROUP_COMMIT_INSERT)))
          .addMethod(
            getGetWalQueueSizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PGetWalQueueSizeRequest,
                org.apache.doris.proto.InternalService.PGetWalQueueSizeResponse>(
                  this, METHODID_GET_WAL_QUEUE_SIZE)))
          .addMethod(
            getFetchArrowFlightSchemaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaRequest,
                org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaResult>(
                  this, METHODID_FETCH_ARROW_FLIGHT_SCHEMA)))
          .addMethod(
            getFetchRemoteTabletSchemaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PFetchRemoteSchemaRequest,
                org.apache.doris.proto.InternalService.PFetchRemoteSchemaResponse>(
                  this, METHODID_FETCH_REMOTE_TABLET_SCHEMA)))
          .addMethod(
            getTestJdbcConnectionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.doris.proto.InternalService.PJdbcTestConnectionRequest,
                org.apache.doris.proto.InternalService.PJdbcTestConnectionResult>(
                  this, METHODID_TEST_JDBC_CONNECTION)))
          .build();
    }
  }

  /**
   */
  public static final class PBackendServiceStub extends io.grpc.stub.AbstractAsyncStub<PBackendServiceStub> {
    private PBackendServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PBackendServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PBackendServiceStub(channel, callOptions);
    }

    /**
     */
    public void transmitData(org.apache.doris.proto.InternalService.PTransmitDataParams request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTransmitDataResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTransmitDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transmitDataByHttp(org.apache.doris.proto.InternalService.PEmptyRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTransmitDataResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTransmitDataByHttpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * If #fragments of a query is &lt; 3, use exec_plan_fragment directly.
     * If #fragments of a query is &gt;=3, use exec_plan_fragment_prepare + exec_plan_fragment_start
     * </pre>
     */
    public void execPlanFragment(org.apache.doris.proto.InternalService.PExecPlanFragmentRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PExecPlanFragmentResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecPlanFragmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void execPlanFragmentPrepare(org.apache.doris.proto.InternalService.PExecPlanFragmentRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PExecPlanFragmentResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecPlanFragmentPrepareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void execPlanFragmentStart(org.apache.doris.proto.InternalService.PExecPlanFragmentStartRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PExecPlanFragmentResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecPlanFragmentStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelPlanFragment(org.apache.doris.proto.InternalService.PCancelPlanFragmentRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PCancelPlanFragmentResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelPlanFragmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchData(org.apache.doris.proto.InternalService.PFetchDataRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PFetchDataResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFetchDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tabletWriterOpen(org.apache.doris.proto.InternalService.PTabletWriterOpenRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTabletWriterOpenResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTabletWriterOpenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void openLoadStream(org.apache.doris.proto.InternalService.POpenLoadStreamRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.POpenLoadStreamResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOpenLoadStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tabletWriterAddBlock(org.apache.doris.proto.InternalService.PTabletWriterAddBlockRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTabletWriterAddBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tabletWriterAddBlockByHttp(org.apache.doris.proto.InternalService.PEmptyRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTabletWriterAddBlockByHttpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tabletWriterCancel(org.apache.doris.proto.InternalService.PTabletWriterCancelRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTabletWriterCancelResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTabletWriterCancelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getInfo(org.apache.doris.proto.InternalService.PProxyRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PProxyResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCache(org.apache.doris.proto.InternalService.PUpdateCacheRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PCacheResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCacheMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchCache(org.apache.doris.proto.InternalService.PFetchCacheRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PFetchCacheResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFetchCacheMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void clearCache(org.apache.doris.proto.InternalService.PClearCacheRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PCacheResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClearCacheMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendData(org.apache.doris.proto.InternalService.PSendDataRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PSendDataResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void commit(org.apache.doris.proto.InternalService.PCommitRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PCommitResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rollback(org.apache.doris.proto.InternalService.PRollbackRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PRollbackResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRollbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mergeFilter(org.apache.doris.proto.InternalService.PMergeFilterRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PMergeFilterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMergeFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendFilterSize(org.apache.doris.proto.InternalService.PSendFilterSizeRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PSendFilterSizeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendFilterSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void syncFilterSize(org.apache.doris.proto.InternalService.PSyncFilterSizeRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PSyncFilterSizeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSyncFilterSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void applyFilter(org.apache.doris.proto.InternalService.PPublishFilterRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PPublishFilterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getApplyFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void applyFilterv2(org.apache.doris.proto.InternalService.PPublishFilterRequestV2 request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PPublishFilterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getApplyFilterv2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void foldConstantExpr(org.apache.doris.proto.InternalService.PConstantExprRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PConstantExprResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFoldConstantExprMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transmitBlock(org.apache.doris.proto.InternalService.PTransmitDataParams request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTransmitDataResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTransmitBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transmitBlockByHttp(org.apache.doris.proto.InternalService.PEmptyRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTransmitDataResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTransmitBlockByHttpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkRpcChannel(org.apache.doris.proto.InternalService.PCheckRPCChannelRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PCheckRPCChannelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckRpcChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resetRpcChannel(org.apache.doris.proto.InternalService.PResetRPCChannelRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PResetRPCChannelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResetRpcChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handShake(org.apache.doris.proto.Types.PHandShakeRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.Types.PHandShakeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHandShakeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void requestSlaveTabletPullRowset(org.apache.doris.proto.InternalService.PTabletWriteSlaveRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTabletWriteSlaveResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRequestSlaveTabletPullRowsetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void responseSlaveTabletPullRowset(org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResponseSlaveTabletPullRowsetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void outfileWriteSuccess(org.apache.doris.proto.InternalService.POutfileWriteSuccessRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.POutfileWriteSuccessResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOutfileWriteSuccessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchTableSchema(org.apache.doris.proto.InternalService.PFetchTableSchemaRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PFetchTableSchemaResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFetchTableSchemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void multigetData(org.apache.doris.proto.InternalService.PMultiGetRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PMultiGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMultigetDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tabletFetchData(org.apache.doris.proto.InternalService.PTabletKeyLookupRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTabletKeyLookupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTabletFetchDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getColumnIdsByTabletIds(org.apache.doris.proto.InternalService.PFetchColIdsRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PFetchColIdsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetColumnIdsByTabletIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTabletRowsetVersions(org.apache.doris.proto.InternalService.PGetTabletVersionsRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PGetTabletVersionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTabletRowsetVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reportStreamLoadStatus(org.apache.doris.proto.InternalService.PReportStreamLoadStatusRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PReportStreamLoadStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReportStreamLoadStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void glob(org.apache.doris.proto.InternalService.PGlobRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PGlobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGlobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void groupCommitInsert(org.apache.doris.proto.InternalService.PGroupCommitInsertRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PGroupCommitInsertResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGroupCommitInsertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWalQueueSize(org.apache.doris.proto.InternalService.PGetWalQueueSizeRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PGetWalQueueSizeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWalQueueSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchArrowFlightSchema(org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFetchArrowFlightSchemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchRemoteTabletSchema(org.apache.doris.proto.InternalService.PFetchRemoteSchemaRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PFetchRemoteSchemaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFetchRemoteTabletSchemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void testJdbcConnection(org.apache.doris.proto.InternalService.PJdbcTestConnectionRequest request,
        io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PJdbcTestConnectionResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTestJdbcConnectionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PBackendServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PBackendServiceBlockingStub> {
    private PBackendServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PBackendServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PBackendServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PTransmitDataResult transmitData(org.apache.doris.proto.InternalService.PTransmitDataParams request) {
      return blockingUnaryCall(
          getChannel(), getTransmitDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PTransmitDataResult transmitDataByHttp(org.apache.doris.proto.InternalService.PEmptyRequest request) {
      return blockingUnaryCall(
          getChannel(), getTransmitDataByHttpMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * If #fragments of a query is &lt; 3, use exec_plan_fragment directly.
     * If #fragments of a query is &gt;=3, use exec_plan_fragment_prepare + exec_plan_fragment_start
     * </pre>
     */
    public org.apache.doris.proto.InternalService.PExecPlanFragmentResult execPlanFragment(org.apache.doris.proto.InternalService.PExecPlanFragmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getExecPlanFragmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PExecPlanFragmentResult execPlanFragmentPrepare(org.apache.doris.proto.InternalService.PExecPlanFragmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getExecPlanFragmentPrepareMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PExecPlanFragmentResult execPlanFragmentStart(org.apache.doris.proto.InternalService.PExecPlanFragmentStartRequest request) {
      return blockingUnaryCall(
          getChannel(), getExecPlanFragmentStartMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PCancelPlanFragmentResult cancelPlanFragment(org.apache.doris.proto.InternalService.PCancelPlanFragmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getCancelPlanFragmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PFetchDataResult fetchData(org.apache.doris.proto.InternalService.PFetchDataRequest request) {
      return blockingUnaryCall(
          getChannel(), getFetchDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PTabletWriterOpenResult tabletWriterOpen(org.apache.doris.proto.InternalService.PTabletWriterOpenRequest request) {
      return blockingUnaryCall(
          getChannel(), getTabletWriterOpenMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.POpenLoadStreamResponse openLoadStream(org.apache.doris.proto.InternalService.POpenLoadStreamRequest request) {
      return blockingUnaryCall(
          getChannel(), getOpenLoadStreamMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult tabletWriterAddBlock(org.apache.doris.proto.InternalService.PTabletWriterAddBlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getTabletWriterAddBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult tabletWriterAddBlockByHttp(org.apache.doris.proto.InternalService.PEmptyRequest request) {
      return blockingUnaryCall(
          getChannel(), getTabletWriterAddBlockByHttpMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PTabletWriterCancelResult tabletWriterCancel(org.apache.doris.proto.InternalService.PTabletWriterCancelRequest request) {
      return blockingUnaryCall(
          getChannel(), getTabletWriterCancelMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PProxyResult getInfo(org.apache.doris.proto.InternalService.PProxyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PCacheResponse updateCache(org.apache.doris.proto.InternalService.PUpdateCacheRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCacheMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PFetchCacheResult fetchCache(org.apache.doris.proto.InternalService.PFetchCacheRequest request) {
      return blockingUnaryCall(
          getChannel(), getFetchCacheMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PCacheResponse clearCache(org.apache.doris.proto.InternalService.PClearCacheRequest request) {
      return blockingUnaryCall(
          getChannel(), getClearCacheMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PSendDataResult sendData(org.apache.doris.proto.InternalService.PSendDataRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PCommitResult commit(org.apache.doris.proto.InternalService.PCommitRequest request) {
      return blockingUnaryCall(
          getChannel(), getCommitMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PRollbackResult rollback(org.apache.doris.proto.InternalService.PRollbackRequest request) {
      return blockingUnaryCall(
          getChannel(), getRollbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PMergeFilterResponse mergeFilter(org.apache.doris.proto.InternalService.PMergeFilterRequest request) {
      return blockingUnaryCall(
          getChannel(), getMergeFilterMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PSendFilterSizeResponse sendFilterSize(org.apache.doris.proto.InternalService.PSendFilterSizeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendFilterSizeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PSyncFilterSizeResponse syncFilterSize(org.apache.doris.proto.InternalService.PSyncFilterSizeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSyncFilterSizeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PPublishFilterResponse applyFilter(org.apache.doris.proto.InternalService.PPublishFilterRequest request) {
      return blockingUnaryCall(
          getChannel(), getApplyFilterMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PPublishFilterResponse applyFilterv2(org.apache.doris.proto.InternalService.PPublishFilterRequestV2 request) {
      return blockingUnaryCall(
          getChannel(), getApplyFilterv2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PConstantExprResult foldConstantExpr(org.apache.doris.proto.InternalService.PConstantExprRequest request) {
      return blockingUnaryCall(
          getChannel(), getFoldConstantExprMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PTransmitDataResult transmitBlock(org.apache.doris.proto.InternalService.PTransmitDataParams request) {
      return blockingUnaryCall(
          getChannel(), getTransmitBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PTransmitDataResult transmitBlockByHttp(org.apache.doris.proto.InternalService.PEmptyRequest request) {
      return blockingUnaryCall(
          getChannel(), getTransmitBlockByHttpMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PCheckRPCChannelResponse checkRpcChannel(org.apache.doris.proto.InternalService.PCheckRPCChannelRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckRpcChannelMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PResetRPCChannelResponse resetRpcChannel(org.apache.doris.proto.InternalService.PResetRPCChannelRequest request) {
      return blockingUnaryCall(
          getChannel(), getResetRpcChannelMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.Types.PHandShakeResponse handShake(org.apache.doris.proto.Types.PHandShakeRequest request) {
      return blockingUnaryCall(
          getChannel(), getHandShakeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PTabletWriteSlaveResult requestSlaveTabletPullRowset(org.apache.doris.proto.InternalService.PTabletWriteSlaveRequest request) {
      return blockingUnaryCall(
          getChannel(), getRequestSlaveTabletPullRowsetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneResult responseSlaveTabletPullRowset(org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneRequest request) {
      return blockingUnaryCall(
          getChannel(), getResponseSlaveTabletPullRowsetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.POutfileWriteSuccessResult outfileWriteSuccess(org.apache.doris.proto.InternalService.POutfileWriteSuccessRequest request) {
      return blockingUnaryCall(
          getChannel(), getOutfileWriteSuccessMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PFetchTableSchemaResult fetchTableSchema(org.apache.doris.proto.InternalService.PFetchTableSchemaRequest request) {
      return blockingUnaryCall(
          getChannel(), getFetchTableSchemaMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PMultiGetResponse multigetData(org.apache.doris.proto.InternalService.PMultiGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getMultigetDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PTabletKeyLookupResponse tabletFetchData(org.apache.doris.proto.InternalService.PTabletKeyLookupRequest request) {
      return blockingUnaryCall(
          getChannel(), getTabletFetchDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PFetchColIdsResponse getColumnIdsByTabletIds(org.apache.doris.proto.InternalService.PFetchColIdsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetColumnIdsByTabletIdsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PGetTabletVersionsResponse getTabletRowsetVersions(org.apache.doris.proto.InternalService.PGetTabletVersionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTabletRowsetVersionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PReportStreamLoadStatusResponse reportStreamLoadStatus(org.apache.doris.proto.InternalService.PReportStreamLoadStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getReportStreamLoadStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PGlobResponse glob(org.apache.doris.proto.InternalService.PGlobRequest request) {
      return blockingUnaryCall(
          getChannel(), getGlobMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PGroupCommitInsertResponse groupCommitInsert(org.apache.doris.proto.InternalService.PGroupCommitInsertRequest request) {
      return blockingUnaryCall(
          getChannel(), getGroupCommitInsertMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PGetWalQueueSizeResponse getWalQueueSize(org.apache.doris.proto.InternalService.PGetWalQueueSizeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetWalQueueSizeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaResult fetchArrowFlightSchema(org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaRequest request) {
      return blockingUnaryCall(
          getChannel(), getFetchArrowFlightSchemaMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PFetchRemoteSchemaResponse fetchRemoteTabletSchema(org.apache.doris.proto.InternalService.PFetchRemoteSchemaRequest request) {
      return blockingUnaryCall(
          getChannel(), getFetchRemoteTabletSchemaMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.doris.proto.InternalService.PJdbcTestConnectionResult testJdbcConnection(org.apache.doris.proto.InternalService.PJdbcTestConnectionRequest request) {
      return blockingUnaryCall(
          getChannel(), getTestJdbcConnectionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PBackendServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PBackendServiceFutureStub> {
    private PBackendServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PBackendServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PBackendServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PTransmitDataResult> transmitData(
        org.apache.doris.proto.InternalService.PTransmitDataParams request) {
      return futureUnaryCall(
          getChannel().newCall(getTransmitDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PTransmitDataResult> transmitDataByHttp(
        org.apache.doris.proto.InternalService.PEmptyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTransmitDataByHttpMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * If #fragments of a query is &lt; 3, use exec_plan_fragment directly.
     * If #fragments of a query is &gt;=3, use exec_plan_fragment_prepare + exec_plan_fragment_start
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PExecPlanFragmentResult> execPlanFragment(
        org.apache.doris.proto.InternalService.PExecPlanFragmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExecPlanFragmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PExecPlanFragmentResult> execPlanFragmentPrepare(
        org.apache.doris.proto.InternalService.PExecPlanFragmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExecPlanFragmentPrepareMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PExecPlanFragmentResult> execPlanFragmentStart(
        org.apache.doris.proto.InternalService.PExecPlanFragmentStartRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExecPlanFragmentStartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PCancelPlanFragmentResult> cancelPlanFragment(
        org.apache.doris.proto.InternalService.PCancelPlanFragmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelPlanFragmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PFetchDataResult> fetchData(
        org.apache.doris.proto.InternalService.PFetchDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFetchDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PTabletWriterOpenResult> tabletWriterOpen(
        org.apache.doris.proto.InternalService.PTabletWriterOpenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTabletWriterOpenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.POpenLoadStreamResponse> openLoadStream(
        org.apache.doris.proto.InternalService.POpenLoadStreamRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOpenLoadStreamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult> tabletWriterAddBlock(
        org.apache.doris.proto.InternalService.PTabletWriterAddBlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTabletWriterAddBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult> tabletWriterAddBlockByHttp(
        org.apache.doris.proto.InternalService.PEmptyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTabletWriterAddBlockByHttpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PTabletWriterCancelResult> tabletWriterCancel(
        org.apache.doris.proto.InternalService.PTabletWriterCancelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTabletWriterCancelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PProxyResult> getInfo(
        org.apache.doris.proto.InternalService.PProxyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PCacheResponse> updateCache(
        org.apache.doris.proto.InternalService.PUpdateCacheRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCacheMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PFetchCacheResult> fetchCache(
        org.apache.doris.proto.InternalService.PFetchCacheRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFetchCacheMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PCacheResponse> clearCache(
        org.apache.doris.proto.InternalService.PClearCacheRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClearCacheMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PSendDataResult> sendData(
        org.apache.doris.proto.InternalService.PSendDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PCommitResult> commit(
        org.apache.doris.proto.InternalService.PCommitRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCommitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PRollbackResult> rollback(
        org.apache.doris.proto.InternalService.PRollbackRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRollbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PMergeFilterResponse> mergeFilter(
        org.apache.doris.proto.InternalService.PMergeFilterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMergeFilterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PSendFilterSizeResponse> sendFilterSize(
        org.apache.doris.proto.InternalService.PSendFilterSizeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendFilterSizeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PSyncFilterSizeResponse> syncFilterSize(
        org.apache.doris.proto.InternalService.PSyncFilterSizeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSyncFilterSizeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PPublishFilterResponse> applyFilter(
        org.apache.doris.proto.InternalService.PPublishFilterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getApplyFilterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PPublishFilterResponse> applyFilterv2(
        org.apache.doris.proto.InternalService.PPublishFilterRequestV2 request) {
      return futureUnaryCall(
          getChannel().newCall(getApplyFilterv2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PConstantExprResult> foldConstantExpr(
        org.apache.doris.proto.InternalService.PConstantExprRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFoldConstantExprMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PTransmitDataResult> transmitBlock(
        org.apache.doris.proto.InternalService.PTransmitDataParams request) {
      return futureUnaryCall(
          getChannel().newCall(getTransmitBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PTransmitDataResult> transmitBlockByHttp(
        org.apache.doris.proto.InternalService.PEmptyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTransmitBlockByHttpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PCheckRPCChannelResponse> checkRpcChannel(
        org.apache.doris.proto.InternalService.PCheckRPCChannelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckRpcChannelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PResetRPCChannelResponse> resetRpcChannel(
        org.apache.doris.proto.InternalService.PResetRPCChannelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getResetRpcChannelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.Types.PHandShakeResponse> handShake(
        org.apache.doris.proto.Types.PHandShakeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHandShakeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PTabletWriteSlaveResult> requestSlaveTabletPullRowset(
        org.apache.doris.proto.InternalService.PTabletWriteSlaveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRequestSlaveTabletPullRowsetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneResult> responseSlaveTabletPullRowset(
        org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getResponseSlaveTabletPullRowsetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.POutfileWriteSuccessResult> outfileWriteSuccess(
        org.apache.doris.proto.InternalService.POutfileWriteSuccessRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOutfileWriteSuccessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PFetchTableSchemaResult> fetchTableSchema(
        org.apache.doris.proto.InternalService.PFetchTableSchemaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFetchTableSchemaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PMultiGetResponse> multigetData(
        org.apache.doris.proto.InternalService.PMultiGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMultigetDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PTabletKeyLookupResponse> tabletFetchData(
        org.apache.doris.proto.InternalService.PTabletKeyLookupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTabletFetchDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PFetchColIdsResponse> getColumnIdsByTabletIds(
        org.apache.doris.proto.InternalService.PFetchColIdsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetColumnIdsByTabletIdsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PGetTabletVersionsResponse> getTabletRowsetVersions(
        org.apache.doris.proto.InternalService.PGetTabletVersionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTabletRowsetVersionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PReportStreamLoadStatusResponse> reportStreamLoadStatus(
        org.apache.doris.proto.InternalService.PReportStreamLoadStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReportStreamLoadStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PGlobResponse> glob(
        org.apache.doris.proto.InternalService.PGlobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGlobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PGroupCommitInsertResponse> groupCommitInsert(
        org.apache.doris.proto.InternalService.PGroupCommitInsertRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGroupCommitInsertMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PGetWalQueueSizeResponse> getWalQueueSize(
        org.apache.doris.proto.InternalService.PGetWalQueueSizeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWalQueueSizeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaResult> fetchArrowFlightSchema(
        org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFetchArrowFlightSchemaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PFetchRemoteSchemaResponse> fetchRemoteTabletSchema(
        org.apache.doris.proto.InternalService.PFetchRemoteSchemaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFetchRemoteTabletSchemaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.doris.proto.InternalService.PJdbcTestConnectionResult> testJdbcConnection(
        org.apache.doris.proto.InternalService.PJdbcTestConnectionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTestJdbcConnectionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TRANSMIT_DATA = 0;
  private static final int METHODID_TRANSMIT_DATA_BY_HTTP = 1;
  private static final int METHODID_EXEC_PLAN_FRAGMENT = 2;
  private static final int METHODID_EXEC_PLAN_FRAGMENT_PREPARE = 3;
  private static final int METHODID_EXEC_PLAN_FRAGMENT_START = 4;
  private static final int METHODID_CANCEL_PLAN_FRAGMENT = 5;
  private static final int METHODID_FETCH_DATA = 6;
  private static final int METHODID_TABLET_WRITER_OPEN = 7;
  private static final int METHODID_OPEN_LOAD_STREAM = 8;
  private static final int METHODID_TABLET_WRITER_ADD_BLOCK = 9;
  private static final int METHODID_TABLET_WRITER_ADD_BLOCK_BY_HTTP = 10;
  private static final int METHODID_TABLET_WRITER_CANCEL = 11;
  private static final int METHODID_GET_INFO = 12;
  private static final int METHODID_UPDATE_CACHE = 13;
  private static final int METHODID_FETCH_CACHE = 14;
  private static final int METHODID_CLEAR_CACHE = 15;
  private static final int METHODID_SEND_DATA = 16;
  private static final int METHODID_COMMIT = 17;
  private static final int METHODID_ROLLBACK = 18;
  private static final int METHODID_MERGE_FILTER = 19;
  private static final int METHODID_SEND_FILTER_SIZE = 20;
  private static final int METHODID_SYNC_FILTER_SIZE = 21;
  private static final int METHODID_APPLY_FILTER = 22;
  private static final int METHODID_APPLY_FILTERV2 = 23;
  private static final int METHODID_FOLD_CONSTANT_EXPR = 24;
  private static final int METHODID_TRANSMIT_BLOCK = 25;
  private static final int METHODID_TRANSMIT_BLOCK_BY_HTTP = 26;
  private static final int METHODID_CHECK_RPC_CHANNEL = 27;
  private static final int METHODID_RESET_RPC_CHANNEL = 28;
  private static final int METHODID_HAND_SHAKE = 29;
  private static final int METHODID_REQUEST_SLAVE_TABLET_PULL_ROWSET = 30;
  private static final int METHODID_RESPONSE_SLAVE_TABLET_PULL_ROWSET = 31;
  private static final int METHODID_OUTFILE_WRITE_SUCCESS = 32;
  private static final int METHODID_FETCH_TABLE_SCHEMA = 33;
  private static final int METHODID_MULTIGET_DATA = 34;
  private static final int METHODID_TABLET_FETCH_DATA = 35;
  private static final int METHODID_GET_COLUMN_IDS_BY_TABLET_IDS = 36;
  private static final int METHODID_GET_TABLET_ROWSET_VERSIONS = 37;
  private static final int METHODID_REPORT_STREAM_LOAD_STATUS = 38;
  private static final int METHODID_GLOB = 39;
  private static final int METHODID_GROUP_COMMIT_INSERT = 40;
  private static final int METHODID_GET_WAL_QUEUE_SIZE = 41;
  private static final int METHODID_FETCH_ARROW_FLIGHT_SCHEMA = 42;
  private static final int METHODID_FETCH_REMOTE_TABLET_SCHEMA = 43;
  private static final int METHODID_TEST_JDBC_CONNECTION = 44;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PBackendServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PBackendServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRANSMIT_DATA:
          serviceImpl.transmitData((org.apache.doris.proto.InternalService.PTransmitDataParams) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTransmitDataResult>) responseObserver);
          break;
        case METHODID_TRANSMIT_DATA_BY_HTTP:
          serviceImpl.transmitDataByHttp((org.apache.doris.proto.InternalService.PEmptyRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTransmitDataResult>) responseObserver);
          break;
        case METHODID_EXEC_PLAN_FRAGMENT:
          serviceImpl.execPlanFragment((org.apache.doris.proto.InternalService.PExecPlanFragmentRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PExecPlanFragmentResult>) responseObserver);
          break;
        case METHODID_EXEC_PLAN_FRAGMENT_PREPARE:
          serviceImpl.execPlanFragmentPrepare((org.apache.doris.proto.InternalService.PExecPlanFragmentRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PExecPlanFragmentResult>) responseObserver);
          break;
        case METHODID_EXEC_PLAN_FRAGMENT_START:
          serviceImpl.execPlanFragmentStart((org.apache.doris.proto.InternalService.PExecPlanFragmentStartRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PExecPlanFragmentResult>) responseObserver);
          break;
        case METHODID_CANCEL_PLAN_FRAGMENT:
          serviceImpl.cancelPlanFragment((org.apache.doris.proto.InternalService.PCancelPlanFragmentRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PCancelPlanFragmentResult>) responseObserver);
          break;
        case METHODID_FETCH_DATA:
          serviceImpl.fetchData((org.apache.doris.proto.InternalService.PFetchDataRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PFetchDataResult>) responseObserver);
          break;
        case METHODID_TABLET_WRITER_OPEN:
          serviceImpl.tabletWriterOpen((org.apache.doris.proto.InternalService.PTabletWriterOpenRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTabletWriterOpenResult>) responseObserver);
          break;
        case METHODID_OPEN_LOAD_STREAM:
          serviceImpl.openLoadStream((org.apache.doris.proto.InternalService.POpenLoadStreamRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.POpenLoadStreamResponse>) responseObserver);
          break;
        case METHODID_TABLET_WRITER_ADD_BLOCK:
          serviceImpl.tabletWriterAddBlock((org.apache.doris.proto.InternalService.PTabletWriterAddBlockRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult>) responseObserver);
          break;
        case METHODID_TABLET_WRITER_ADD_BLOCK_BY_HTTP:
          serviceImpl.tabletWriterAddBlockByHttp((org.apache.doris.proto.InternalService.PEmptyRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTabletWriterAddBlockResult>) responseObserver);
          break;
        case METHODID_TABLET_WRITER_CANCEL:
          serviceImpl.tabletWriterCancel((org.apache.doris.proto.InternalService.PTabletWriterCancelRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTabletWriterCancelResult>) responseObserver);
          break;
        case METHODID_GET_INFO:
          serviceImpl.getInfo((org.apache.doris.proto.InternalService.PProxyRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PProxyResult>) responseObserver);
          break;
        case METHODID_UPDATE_CACHE:
          serviceImpl.updateCache((org.apache.doris.proto.InternalService.PUpdateCacheRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PCacheResponse>) responseObserver);
          break;
        case METHODID_FETCH_CACHE:
          serviceImpl.fetchCache((org.apache.doris.proto.InternalService.PFetchCacheRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PFetchCacheResult>) responseObserver);
          break;
        case METHODID_CLEAR_CACHE:
          serviceImpl.clearCache((org.apache.doris.proto.InternalService.PClearCacheRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PCacheResponse>) responseObserver);
          break;
        case METHODID_SEND_DATA:
          serviceImpl.sendData((org.apache.doris.proto.InternalService.PSendDataRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PSendDataResult>) responseObserver);
          break;
        case METHODID_COMMIT:
          serviceImpl.commit((org.apache.doris.proto.InternalService.PCommitRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PCommitResult>) responseObserver);
          break;
        case METHODID_ROLLBACK:
          serviceImpl.rollback((org.apache.doris.proto.InternalService.PRollbackRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PRollbackResult>) responseObserver);
          break;
        case METHODID_MERGE_FILTER:
          serviceImpl.mergeFilter((org.apache.doris.proto.InternalService.PMergeFilterRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PMergeFilterResponse>) responseObserver);
          break;
        case METHODID_SEND_FILTER_SIZE:
          serviceImpl.sendFilterSize((org.apache.doris.proto.InternalService.PSendFilterSizeRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PSendFilterSizeResponse>) responseObserver);
          break;
        case METHODID_SYNC_FILTER_SIZE:
          serviceImpl.syncFilterSize((org.apache.doris.proto.InternalService.PSyncFilterSizeRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PSyncFilterSizeResponse>) responseObserver);
          break;
        case METHODID_APPLY_FILTER:
          serviceImpl.applyFilter((org.apache.doris.proto.InternalService.PPublishFilterRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PPublishFilterResponse>) responseObserver);
          break;
        case METHODID_APPLY_FILTERV2:
          serviceImpl.applyFilterv2((org.apache.doris.proto.InternalService.PPublishFilterRequestV2) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PPublishFilterResponse>) responseObserver);
          break;
        case METHODID_FOLD_CONSTANT_EXPR:
          serviceImpl.foldConstantExpr((org.apache.doris.proto.InternalService.PConstantExprRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PConstantExprResult>) responseObserver);
          break;
        case METHODID_TRANSMIT_BLOCK:
          serviceImpl.transmitBlock((org.apache.doris.proto.InternalService.PTransmitDataParams) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTransmitDataResult>) responseObserver);
          break;
        case METHODID_TRANSMIT_BLOCK_BY_HTTP:
          serviceImpl.transmitBlockByHttp((org.apache.doris.proto.InternalService.PEmptyRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTransmitDataResult>) responseObserver);
          break;
        case METHODID_CHECK_RPC_CHANNEL:
          serviceImpl.checkRpcChannel((org.apache.doris.proto.InternalService.PCheckRPCChannelRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PCheckRPCChannelResponse>) responseObserver);
          break;
        case METHODID_RESET_RPC_CHANNEL:
          serviceImpl.resetRpcChannel((org.apache.doris.proto.InternalService.PResetRPCChannelRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PResetRPCChannelResponse>) responseObserver);
          break;
        case METHODID_HAND_SHAKE:
          serviceImpl.handShake((org.apache.doris.proto.Types.PHandShakeRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.Types.PHandShakeResponse>) responseObserver);
          break;
        case METHODID_REQUEST_SLAVE_TABLET_PULL_ROWSET:
          serviceImpl.requestSlaveTabletPullRowset((org.apache.doris.proto.InternalService.PTabletWriteSlaveRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTabletWriteSlaveResult>) responseObserver);
          break;
        case METHODID_RESPONSE_SLAVE_TABLET_PULL_ROWSET:
          serviceImpl.responseSlaveTabletPullRowset((org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTabletWriteSlaveDoneResult>) responseObserver);
          break;
        case METHODID_OUTFILE_WRITE_SUCCESS:
          serviceImpl.outfileWriteSuccess((org.apache.doris.proto.InternalService.POutfileWriteSuccessRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.POutfileWriteSuccessResult>) responseObserver);
          break;
        case METHODID_FETCH_TABLE_SCHEMA:
          serviceImpl.fetchTableSchema((org.apache.doris.proto.InternalService.PFetchTableSchemaRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PFetchTableSchemaResult>) responseObserver);
          break;
        case METHODID_MULTIGET_DATA:
          serviceImpl.multigetData((org.apache.doris.proto.InternalService.PMultiGetRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PMultiGetResponse>) responseObserver);
          break;
        case METHODID_TABLET_FETCH_DATA:
          serviceImpl.tabletFetchData((org.apache.doris.proto.InternalService.PTabletKeyLookupRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PTabletKeyLookupResponse>) responseObserver);
          break;
        case METHODID_GET_COLUMN_IDS_BY_TABLET_IDS:
          serviceImpl.getColumnIdsByTabletIds((org.apache.doris.proto.InternalService.PFetchColIdsRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PFetchColIdsResponse>) responseObserver);
          break;
        case METHODID_GET_TABLET_ROWSET_VERSIONS:
          serviceImpl.getTabletRowsetVersions((org.apache.doris.proto.InternalService.PGetTabletVersionsRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PGetTabletVersionsResponse>) responseObserver);
          break;
        case METHODID_REPORT_STREAM_LOAD_STATUS:
          serviceImpl.reportStreamLoadStatus((org.apache.doris.proto.InternalService.PReportStreamLoadStatusRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PReportStreamLoadStatusResponse>) responseObserver);
          break;
        case METHODID_GLOB:
          serviceImpl.glob((org.apache.doris.proto.InternalService.PGlobRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PGlobResponse>) responseObserver);
          break;
        case METHODID_GROUP_COMMIT_INSERT:
          serviceImpl.groupCommitInsert((org.apache.doris.proto.InternalService.PGroupCommitInsertRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PGroupCommitInsertResponse>) responseObserver);
          break;
        case METHODID_GET_WAL_QUEUE_SIZE:
          serviceImpl.getWalQueueSize((org.apache.doris.proto.InternalService.PGetWalQueueSizeRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PGetWalQueueSizeResponse>) responseObserver);
          break;
        case METHODID_FETCH_ARROW_FLIGHT_SCHEMA:
          serviceImpl.fetchArrowFlightSchema((org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PFetchArrowFlightSchemaResult>) responseObserver);
          break;
        case METHODID_FETCH_REMOTE_TABLET_SCHEMA:
          serviceImpl.fetchRemoteTabletSchema((org.apache.doris.proto.InternalService.PFetchRemoteSchemaRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PFetchRemoteSchemaResponse>) responseObserver);
          break;
        case METHODID_TEST_JDBC_CONNECTION:
          serviceImpl.testJdbcConnection((org.apache.doris.proto.InternalService.PJdbcTestConnectionRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.doris.proto.InternalService.PJdbcTestConnectionResult>) responseObserver);
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

  private static abstract class PBackendServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PBackendServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.doris.proto.InternalService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PBackendService");
    }
  }

  private static final class PBackendServiceFileDescriptorSupplier
      extends PBackendServiceBaseDescriptorSupplier {
    PBackendServiceFileDescriptorSupplier() {}
  }

  private static final class PBackendServiceMethodDescriptorSupplier
      extends PBackendServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PBackendServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PBackendServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PBackendServiceFileDescriptorSupplier())
              .addMethod(getTransmitDataMethod())
              .addMethod(getTransmitDataByHttpMethod())
              .addMethod(getExecPlanFragmentMethod())
              .addMethod(getExecPlanFragmentPrepareMethod())
              .addMethod(getExecPlanFragmentStartMethod())
              .addMethod(getCancelPlanFragmentMethod())
              .addMethod(getFetchDataMethod())
              .addMethod(getTabletWriterOpenMethod())
              .addMethod(getOpenLoadStreamMethod())
              .addMethod(getTabletWriterAddBlockMethod())
              .addMethod(getTabletWriterAddBlockByHttpMethod())
              .addMethod(getTabletWriterCancelMethod())
              .addMethod(getGetInfoMethod())
              .addMethod(getUpdateCacheMethod())
              .addMethod(getFetchCacheMethod())
              .addMethod(getClearCacheMethod())
              .addMethod(getSendDataMethod())
              .addMethod(getCommitMethod())
              .addMethod(getRollbackMethod())
              .addMethod(getMergeFilterMethod())
              .addMethod(getSendFilterSizeMethod())
              .addMethod(getSyncFilterSizeMethod())
              .addMethod(getApplyFilterMethod())
              .addMethod(getApplyFilterv2Method())
              .addMethod(getFoldConstantExprMethod())
              .addMethod(getTransmitBlockMethod())
              .addMethod(getTransmitBlockByHttpMethod())
              .addMethod(getCheckRpcChannelMethod())
              .addMethod(getResetRpcChannelMethod())
              .addMethod(getHandShakeMethod())
              .addMethod(getRequestSlaveTabletPullRowsetMethod())
              .addMethod(getResponseSlaveTabletPullRowsetMethod())
              .addMethod(getOutfileWriteSuccessMethod())
              .addMethod(getFetchTableSchemaMethod())
              .addMethod(getMultigetDataMethod())
              .addMethod(getTabletFetchDataMethod())
              .addMethod(getGetColumnIdsByTabletIdsMethod())
              .addMethod(getGetTabletRowsetVersionsMethod())
              .addMethod(getReportStreamLoadStatusMethod())
              .addMethod(getGlobMethod())
              .addMethod(getGroupCommitInsertMethod())
              .addMethod(getGetWalQueueSizeMethod())
              .addMethod(getFetchArrowFlightSchemaMethod())
              .addMethod(getFetchRemoteTabletSchemaMethod())
              .addMethod(getTestJdbcConnectionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
