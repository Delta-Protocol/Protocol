// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IPPN.proto

// This CPP symbol can be defined to use imports that match up to the framework
// imports needed when using CocoaPods.
#if !defined(GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS)
 #define GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS 0
#endif

#if GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS
 #import <Protobuf/GPBProtocolBuffers.h>
#else
 #import "GPBProtocolBuffers.h"
#endif

#if GOOGLE_PROTOBUF_OBJC_VERSION < 30002
#error This file was generated by a newer version of protoc which is incompatible with your Protocol Buffer library sources.
#endif
#if 30002 < GOOGLE_PROTOBUF_OBJC_MIN_SUPPORTED_VERSION
#error This file was generated by an older version of protoc which is incompatible with your Protocol Buffer library sources.
#endif

// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

CF_EXTERN_C_BEGIN

@class DeltaIndex;
@class PeerId;

NS_ASSUME_NONNULL_BEGIN

#pragma mark - IppnRoot

/**
 * Exposes the extension registry for this file.
 *
 * The base class provides:
 * @code
 *   + (GPBExtensionRegistry *)extensionRegistry;
 * @endcode
 * which is a @c GPBExtensionRegistry that includes all the extensions defined by
 * this file and all files that it depends on.
 **/
@interface IppnRoot : GPBRootObject
@end

#pragma mark - PeerNeighborsRequest

@interface PeerNeighborsRequest : GPBMessage

@end

#pragma mark - PeerNeighborsResponse

typedef GPB_ENUM(PeerNeighborsResponse_FieldNumber) {
  PeerNeighborsResponse_FieldNumber_PeersArray = 1,
};

@interface PeerNeighborsResponse : GPBMessage

/** Random subset of a nodes peer db. */
@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<PeerId*> *peersArray;
/** The number of items in @c peersArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger peersArray_Count;

@end

#pragma mark - PingRequest

@interface PingRequest : GPBMessage

@end

#pragma mark - PingResponse

@interface PingResponse : GPBMessage

@end

#pragma mark - LatestDeltaHashRequest

@interface LatestDeltaHashRequest : GPBMessage

@end

#pragma mark - LatestDeltaHashResponse

typedef GPB_ENUM(LatestDeltaHashResponse_FieldNumber) {
  LatestDeltaHashResponse_FieldNumber_DeltaHash = 1,
};

@interface LatestDeltaHashResponse : GPBMessage

/** Rhe cid of a nodes last delta. */
@property(nonatomic, readwrite, copy, null_resettable) NSData *deltaHash;

@end

#pragma mark - DeltaHistoryRequest

typedef GPB_ENUM(DeltaHistoryRequest_FieldNumber) {
  DeltaHistoryRequest_FieldNumber_Range = 1,
  DeltaHistoryRequest_FieldNumber_Height = 2,
};

@interface DeltaHistoryRequest : GPBMessage

/** The number of deltas CIDs a node requests. */
@property(nonatomic, readwrite) uint32_t range;

/** The given height the node wants the range from. */
@property(nonatomic, readwrite) uint32_t height;

@end

#pragma mark - DeltaHistoryResponse

typedef GPB_ENUM(DeltaHistoryResponse_FieldNumber) {
  DeltaHistoryResponse_FieldNumber_ResultArray = 1,
};

@interface DeltaHistoryResponse : GPBMessage

/** K given del */
@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<DeltaIndex*> *resultArray;
/** The number of items in @c resultArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger resultArray_Count;

@end

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)
