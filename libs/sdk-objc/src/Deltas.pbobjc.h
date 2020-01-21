// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Deltas.proto

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

@class CoinbaseEntry;
@class ConfidentialEntry;
@class GPBTimestamp;
@class PublicEntry;

NS_ASSUME_NONNULL_BEGIN

#pragma mark - DeltasRoot

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
@interface DeltasRoot : GPBRootObject
@end

#pragma mark - DeltaIndex

typedef GPB_ENUM(DeltaIndex_FieldNumber) {
  DeltaIndex_FieldNumber_Height = 1,
  DeltaIndex_FieldNumber_Cid = 2,
};

@interface DeltaIndex : GPBMessage

@property(nonatomic, readwrite) uint32_t height;

@property(nonatomic, readwrite, copy, null_resettable) NSData *cid;

@end

#pragma mark - Delta

typedef GPB_ENUM(Delta_FieldNumber) {
  Delta_FieldNumber_PreviousDeltaDfsHash = 1,
  Delta_FieldNumber_MerkleRoot = 2,
  Delta_FieldNumber_MerklePoda = 3,
  Delta_FieldNumber_TimeStamp = 4,
  Delta_FieldNumber_PublicEntriesArray = 5,
  Delta_FieldNumber_ConfidentialEntriesArray = 6,
  Delta_FieldNumber_CoinbaseEntriesArray = 7,
};

@interface Delta : GPBMessage

/**  address for the content of the previous delta on the DFS */
@property(nonatomic, readwrite, copy, null_resettable) NSData *previousDeltaDfsHash;

@property(nonatomic, readwrite, copy, null_resettable) NSData *merkleRoot;

/** proof of delegated authority for active wokers */
@property(nonatomic, readwrite, copy, null_resettable) NSData *merklePoda;

@property(nonatomic, readwrite, strong, null_resettable) GPBTimestamp *timeStamp;
/** Test to see if @c timeStamp has been set. */
@property(nonatomic, readwrite) BOOL hasTimeStamp;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<PublicEntry*> *publicEntriesArray;
/** The number of items in @c publicEntriesArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger publicEntriesArray_Count;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<ConfidentialEntry*> *confidentialEntriesArray;
/** The number of items in @c confidentialEntriesArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger confidentialEntriesArray_Count;

/** one per active worker */
@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<CoinbaseEntry*> *coinbaseEntriesArray;
/** The number of items in @c coinbaseEntriesArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger coinbaseEntriesArray_Count;

@end

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)
