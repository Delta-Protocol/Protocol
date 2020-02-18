# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Account.proto

from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import Cryptography_pb2 as Cryptography__pb2
import Network_pb2 as Network__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='Account.proto',
  package='Catalyst.Protocol.Account',
  syntax='proto3',
  serialized_options=b'P\001',
  serialized_pb=b'\n\rAccount.proto\x12\x19\x43\x61talyst.Protocol.Account\x1a\x12\x43ryptography.proto\x1a\rNetwork.proto\"\x9e\x01\n\x07\x41\x64\x64ress\x12<\n\x0cnetwork_type\x18\x01 \x01(\x0e\x32&.Catalyst.Protocol.Network.NetworkType\x12<\n\x0c\x61\x63\x63ount_type\x18\x02 \x01(\x0e\x32&.Catalyst.Protocol.Account.AccountType\x12\x17\n\x0fpublic_key_hash\x18\x03 \x01(\x0c*q\n\x0b\x41\x63\x63ountType\x12\x18\n\x14\x41\x43\x43OUNT_TYPE_UNKNOWN\x10\x00\x12\x12\n\x0ePUBLIC_ACCOUNT\x10\x08\x12\x18\n\x14\x43ONFIDENTIAL_ACCOUNT\x10\x10\x12\x1a\n\x16SMART_CONTRACT_ACCOUNT\x10\x18\x42\x02P\x01\x62\x06proto3'
  ,
  dependencies=[Cryptography__pb2.DESCRIPTOR,Network__pb2.DESCRIPTOR,])

_ACCOUNTTYPE = _descriptor.EnumDescriptor(
  name='AccountType',
  full_name='Catalyst.Protocol.Account.AccountType',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='ACCOUNT_TYPE_UNKNOWN', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='PUBLIC_ACCOUNT', index=1, number=8,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='CONFIDENTIAL_ACCOUNT', index=2, number=16,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='SMART_CONTRACT_ACCOUNT', index=3, number=24,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=240,
  serialized_end=353,
)
_sym_db.RegisterEnumDescriptor(_ACCOUNTTYPE)

AccountType = enum_type_wrapper.EnumTypeWrapper(_ACCOUNTTYPE)
ACCOUNT_TYPE_UNKNOWN = 0
PUBLIC_ACCOUNT = 8
CONFIDENTIAL_ACCOUNT = 16
SMART_CONTRACT_ACCOUNT = 24



_ADDRESS = _descriptor.Descriptor(
  name='Address',
  full_name='Catalyst.Protocol.Account.Address',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='network_type', full_name='Catalyst.Protocol.Account.Address.network_type', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='account_type', full_name='Catalyst.Protocol.Account.Address.account_type', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='public_key_hash', full_name='Catalyst.Protocol.Account.Address.public_key_hash', index=2,
      number=3, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=80,
  serialized_end=238,
)

_ADDRESS.fields_by_name['network_type'].enum_type = Network__pb2._NETWORKTYPE
_ADDRESS.fields_by_name['account_type'].enum_type = _ACCOUNTTYPE
DESCRIPTOR.message_types_by_name['Address'] = _ADDRESS
DESCRIPTOR.enum_types_by_name['AccountType'] = _ACCOUNTTYPE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Address = _reflection.GeneratedProtocolMessageType('Address', (_message.Message,), {
  'DESCRIPTOR' : _ADDRESS,
  '__module__' : 'Account_pb2'
  # @@protoc_insertion_point(class_scope:Catalyst.Protocol.Account.Address)
  })
_sym_db.RegisterMessage(Address)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
