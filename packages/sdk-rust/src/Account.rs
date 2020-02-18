// This file is generated by rust-protobuf 2.10.1. Do not edit
// @generated

// https://github.com/rust-lang/rust-clippy/issues/702
#![allow(unknown_lints)]
#![allow(clippy::all)]

#![cfg_attr(rustfmt, rustfmt_skip)]

#![allow(box_pointers)]
#![allow(dead_code)]
#![allow(missing_docs)]
#![allow(non_camel_case_types)]
#![allow(non_snake_case)]
#![allow(non_upper_case_globals)]
#![allow(trivial_casts)]
#![allow(unsafe_code)]
#![allow(unused_imports)]
#![allow(unused_results)]
//! Generated file from `Account.proto`

use protobuf::Message as Message_imported_for_functions;
use protobuf::ProtobufEnum as ProtobufEnum_imported_for_functions;

/// Generated files are compatible only with the same version
/// of protobuf runtime.
// const _PROTOBUF_VERSION_CHECK: () = ::protobuf::VERSION_2_10_1;

#[derive(PartialEq,Clone,Default)]
pub struct Address {
    // message fields
    pub network_type: super::Network::NetworkType,
    pub account_type: AccountType,
    pub public_key_hash: ::std::vec::Vec<u8>,
    // special fields
    pub unknown_fields: ::protobuf::UnknownFields,
    pub cached_size: ::protobuf::CachedSize,
}

impl<'a> ::std::default::Default for &'a Address {
    fn default() -> &'a Address {
        <Address as ::protobuf::Message>::default_instance()
    }
}

impl Address {
    pub fn new() -> Address {
        ::std::default::Default::default()
    }

    // .Catalyst.Protocol.Network.NetworkType network_type = 1;


    pub fn get_network_type(&self) -> super::Network::NetworkType {
        self.network_type
    }
    pub fn clear_network_type(&mut self) {
        self.network_type = super::Network::NetworkType::NETWORK_TYPE_UNKNOWN;
    }

    // Param is passed by value, moved
    pub fn set_network_type(&mut self, v: super::Network::NetworkType) {
        self.network_type = v;
    }

    // .Catalyst.Protocol.Account.AccountType account_type = 2;


    pub fn get_account_type(&self) -> AccountType {
        self.account_type
    }
    pub fn clear_account_type(&mut self) {
        self.account_type = AccountType::ACCOUNT_TYPE_UNKNOWN;
    }

    // Param is passed by value, moved
    pub fn set_account_type(&mut self, v: AccountType) {
        self.account_type = v;
    }

    // bytes public_key_hash = 3;


    pub fn get_public_key_hash(&self) -> &[u8] {
        &self.public_key_hash
    }
    pub fn clear_public_key_hash(&mut self) {
        self.public_key_hash.clear();
    }

    // Param is passed by value, moved
    pub fn set_public_key_hash(&mut self, v: ::std::vec::Vec<u8>) {
        self.public_key_hash = v;
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_public_key_hash(&mut self) -> &mut ::std::vec::Vec<u8> {
        &mut self.public_key_hash
    }

    // Take field
    pub fn take_public_key_hash(&mut self) -> ::std::vec::Vec<u8> {
        ::std::mem::replace(&mut self.public_key_hash, ::std::vec::Vec::new())
    }
}

impl ::protobuf::Message for Address {
    fn is_initialized(&self) -> bool {
        true
    }

    fn merge_from(&mut self, is: &mut ::protobuf::CodedInputStream<'_>) -> ::protobuf::ProtobufResult<()> {
        while !is.eof()? {
            let (field_number, wire_type) = is.read_tag_unpack()?;
            match field_number {
                1 => {
                    ::protobuf::rt::read_proto3_enum_with_unknown_fields_into(wire_type, is, &mut self.network_type, 1, &mut self.unknown_fields)?
                },
                2 => {
                    ::protobuf::rt::read_proto3_enum_with_unknown_fields_into(wire_type, is, &mut self.account_type, 2, &mut self.unknown_fields)?
                },
                3 => {
                    ::protobuf::rt::read_singular_proto3_bytes_into(wire_type, is, &mut self.public_key_hash)?;
                },
                _ => {
                    ::protobuf::rt::read_unknown_or_skip_group(field_number, wire_type, is, self.mut_unknown_fields())?;
                },
            };
        }
        ::std::result::Result::Ok(())
    }

    // Compute sizes of nested messages
    #[allow(unused_variables)]
    fn compute_size(&self) -> u32 {
        let mut my_size = 0;
        if self.network_type != super::Network::NetworkType::NETWORK_TYPE_UNKNOWN {
            my_size += ::protobuf::rt::enum_size(1, self.network_type);
        }
        if self.account_type != AccountType::ACCOUNT_TYPE_UNKNOWN {
            my_size += ::protobuf::rt::enum_size(2, self.account_type);
        }
        if !self.public_key_hash.is_empty() {
            my_size += ::protobuf::rt::bytes_size(3, &self.public_key_hash);
        }
        my_size += ::protobuf::rt::unknown_fields_size(self.get_unknown_fields());
        self.cached_size.set(my_size);
        my_size
    }

    fn write_to_with_cached_sizes(&self, os: &mut ::protobuf::CodedOutputStream<'_>) -> ::protobuf::ProtobufResult<()> {
        if self.network_type != super::Network::NetworkType::NETWORK_TYPE_UNKNOWN {
            os.write_enum(1, self.network_type.value())?;
        }
        if self.account_type != AccountType::ACCOUNT_TYPE_UNKNOWN {
            os.write_enum(2, self.account_type.value())?;
        }
        if !self.public_key_hash.is_empty() {
            os.write_bytes(3, &self.public_key_hash)?;
        }
        os.write_unknown_fields(self.get_unknown_fields())?;
        ::std::result::Result::Ok(())
    }

    fn get_cached_size(&self) -> u32 {
        self.cached_size.get()
    }

    fn get_unknown_fields(&self) -> &::protobuf::UnknownFields {
        &self.unknown_fields
    }

    fn mut_unknown_fields(&mut self) -> &mut ::protobuf::UnknownFields {
        &mut self.unknown_fields
    }

    fn as_any(&self) -> &dyn (::std::any::Any) {
        self as &dyn (::std::any::Any)
    }
    fn as_any_mut(&mut self) -> &mut dyn (::std::any::Any) {
        self as &mut dyn (::std::any::Any)
    }
    fn into_any(self: Box<Self>) -> ::std::boxed::Box<dyn (::std::any::Any)> {
        self
    }

    fn descriptor(&self) -> &'static ::protobuf::reflect::MessageDescriptor {
        Self::descriptor_static()
    }

    fn new() -> Address {
        Address::new()
    }

    fn descriptor_static() -> &'static ::protobuf::reflect::MessageDescriptor {
        static mut descriptor: ::protobuf::lazy::Lazy<::protobuf::reflect::MessageDescriptor> = ::protobuf::lazy::Lazy {
            lock: ::protobuf::lazy::ONCE_INIT,
            ptr: 0 as *const ::protobuf::reflect::MessageDescriptor,
        };
        unsafe {
            descriptor.get(|| {
                let mut fields = ::std::vec::Vec::new();
                fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeEnum<super::Network::NetworkType>>(
                    "network_type",
                    |m: &Address| { &m.network_type },
                    |m: &mut Address| { &mut m.network_type },
                ));
                fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeEnum<AccountType>>(
                    "account_type",
                    |m: &Address| { &m.account_type },
                    |m: &mut Address| { &mut m.account_type },
                ));
                fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeBytes>(
                    "public_key_hash",
                    |m: &Address| { &m.public_key_hash },
                    |m: &mut Address| { &mut m.public_key_hash },
                ));
                ::protobuf::reflect::MessageDescriptor::new::<Address>(
                    "Address",
                    fields,
                    file_descriptor_proto()
                )
            })
        }
    }

    fn default_instance() -> &'static Address {
        static mut instance: ::protobuf::lazy::Lazy<Address> = ::protobuf::lazy::Lazy {
            lock: ::protobuf::lazy::ONCE_INIT,
            ptr: 0 as *const Address,
        };
        unsafe {
            instance.get(Address::new)
        }
    }
}

impl ::protobuf::Clear for Address {
    fn clear(&mut self) {
        self.network_type = super::Network::NetworkType::NETWORK_TYPE_UNKNOWN;
        self.account_type = AccountType::ACCOUNT_TYPE_UNKNOWN;
        self.public_key_hash.clear();
        self.unknown_fields.clear();
    }
}

impl ::std::fmt::Debug for Address {
    fn fmt(&self, f: &mut ::std::fmt::Formatter<'_>) -> ::std::fmt::Result {
        ::protobuf::text_format::fmt(self, f)
    }
}

impl ::protobuf::reflect::ProtobufValue for Address {
    fn as_ref(&self) -> ::protobuf::reflect::ProtobufValueRef {
        ::protobuf::reflect::ProtobufValueRef::Message(self)
    }
}

#[derive(Clone,PartialEq,Eq,Debug,Hash)]
pub enum AccountType {
    ACCOUNT_TYPE_UNKNOWN = 0,
    PUBLIC_ACCOUNT = 8,
    CONFIDENTIAL_ACCOUNT = 16,
    SMART_CONTRACT_ACCOUNT = 24,
}

impl ::protobuf::ProtobufEnum for AccountType {
    fn value(&self) -> i32 {
        *self as i32
    }

    fn from_i32(value: i32) -> ::std::option::Option<AccountType> {
        match value {
            0 => ::std::option::Option::Some(AccountType::ACCOUNT_TYPE_UNKNOWN),
            8 => ::std::option::Option::Some(AccountType::PUBLIC_ACCOUNT),
            16 => ::std::option::Option::Some(AccountType::CONFIDENTIAL_ACCOUNT),
            24 => ::std::option::Option::Some(AccountType::SMART_CONTRACT_ACCOUNT),
            _ => ::std::option::Option::None
        }
    }

    fn values() -> &'static [Self] {
        static values: &'static [AccountType] = &[
            AccountType::ACCOUNT_TYPE_UNKNOWN,
            AccountType::PUBLIC_ACCOUNT,
            AccountType::CONFIDENTIAL_ACCOUNT,
            AccountType::SMART_CONTRACT_ACCOUNT,
        ];
        values
    }

    fn enum_descriptor_static() -> &'static ::protobuf::reflect::EnumDescriptor {
        static mut descriptor: ::protobuf::lazy::Lazy<::protobuf::reflect::EnumDescriptor> = ::protobuf::lazy::Lazy {
            lock: ::protobuf::lazy::ONCE_INIT,
            ptr: 0 as *const ::protobuf::reflect::EnumDescriptor,
        };
        unsafe {
            descriptor.get(|| {
                ::protobuf::reflect::EnumDescriptor::new("AccountType", file_descriptor_proto())
            })
        }
    }
}

impl ::std::marker::Copy for AccountType {
}

impl ::std::default::Default for AccountType {
    fn default() -> Self {
        AccountType::ACCOUNT_TYPE_UNKNOWN
    }
}

impl ::protobuf::reflect::ProtobufValue for AccountType {
    fn as_ref(&self) -> ::protobuf::reflect::ProtobufValueRef {
        ::protobuf::reflect::ProtobufValueRef::Enum(self.descriptor())
    }
}

static file_descriptor_proto_data: &'static [u8] = b"\
    \n\rAccount.proto\x12\x19Catalyst.Protocol.Account\x1a\x12Cryptography.p\
    roto\x1a\rNetwork.proto\"\xc7\x01\n\x07Address\x12I\n\x0cnetwork_type\
    \x18\x01\x20\x01(\x0e2&.Catalyst.Protocol.Network.NetworkTypeR\x0bnetwor\
    kType\x12I\n\x0caccount_type\x18\x02\x20\x01(\x0e2&.Catalyst.Protocol.Ac\
    count.AccountTypeR\x0baccountType\x12&\n\x0fpublic_key_hash\x18\x03\x20\
    \x01(\x0cR\rpublicKeyHash*q\n\x0bAccountType\x12\x18\n\x14ACCOUNT_TYPE_U\
    NKNOWN\x10\0\x12\x12\n\x0ePUBLIC_ACCOUNT\x10\x08\x12\x18\n\x14CONFIDENTI\
    AL_ACCOUNT\x10\x10\x12\x1a\n\x16SMART_CONTRACT_ACCOUNT\x10\x18B\x02P\x01\
    J\xe6\x0c\n\x06\x12\x04\x13\0(\x01\n\xdf\x06\n\x01\x0c\x12\x03\x13\0\x12\
    2\xd4\x06*\n\x20Copyright\x20(c)\x202019\x20Catalyst\x20Network\n\n\x20T\
    his\x20file\x20is\x20part\x20of\x20Catalyst.Network.Protocol.Protobuffs\
    \x20<https://github.com/catalyst-network/protocol-protobuffs>\n\n\x20Cat\
    alyst.Network.Protocol.Protobuffs\x20is\x20free\x20software:\x20you\x20c\
    an\x20redistribute\x20it\x20and/or\x20modify\n\x20it\x20under\x20the\x20\
    terms\x20of\x20the\x20GNU\x20General\x20Public\x20License\x20as\x20publi\
    shed\x20by\n\x20the\x20Free\x20Software\x20Foundation,\x20either\x20vers\
    ion\x202\x20of\x20the\x20License,\x20or\n\x20(at\x20your\x20option)\x20a\
    ny\x20later\x20version.\n\x20\n\x20Catalyst.Network.Protocol.Protobuffs\
    \x20is\x20distributed\x20in\x20the\x20hope\x20that\x20it\x20will\x20be\
    \x20useful,\n\x20but\x20WITHOUT\x20ANY\x20WARRANTY;\x20without\x20even\
    \x20the\x20implied\x20warranty\x20of\n\x20MERCHANTABILITY\x20or\x20FITNE\
    SS\x20FOR\x20A\x20PARTICULAR\x20PURPOSE.\x20See\x20the\n\x20GNU\x20Gener\
    al\x20Public\x20License\x20for\x20more\x20details.\n\x20\n\x20You\x20sho\
    uld\x20have\x20received\x20a\x20copy\x20of\x20the\x20GNU\x20General\x20P\
    ublic\x20License\n\x20along\x20with\x20Catalyst.Network.Protocol.Protobu\
    ffs\x20If\x20not,\x20see\x20<https://www.gnu.org/licenses/>.\n\n\x08\n\
    \x01\x08\x12\x03\x15\0\"\n\t\n\x02\x08\n\x12\x03\x15\0\"\n\t\n\x02\x03\0\
    \x12\x03\x17\0\x1c\n\t\n\x02\x03\x01\x12\x03\x18\0\x17\n\x08\n\x01\x02\
    \x12\x03\x1a\0\"\n\n\n\x02\x04\0\x12\x04\x1c\0\x20\x01\n\n\n\x03\x04\0\
    \x01\x12\x03\x1c\x08\x0f\n.\n\x04\x04\0\x02\0\x12\x03\x1d\x08-\"!\x20bit\
    \x20signalling\x20the\x20network\x20type\n\n\x0c\n\x05\x04\0\x02\0\x06\
    \x12\x03\x1d\x08\x1b\n\x0c\n\x05\x04\0\x02\0\x01\x12\x03\x1d\x1c(\n\x0c\
    \n\x05\x04\0\x02\0\x03\x12\x03\x1d+,\n1\n\x04\x04\0\x02\x01\x12\x03\x1e\
    \x04!\"$\x20bit\x20signalling\x20the\x20type\x20of\x20account\n\n\x0c\n\
    \x05\x04\0\x02\x01\x06\x12\x03\x1e\x04\x0f\n\x0c\n\x05\x04\0\x02\x01\x01\
    \x12\x03\x1e\x10\x1c\n\x0c\n\x05\x04\0\x02\x01\x03\x12\x03\x1e\x1f\x20\n\
    *\n\x04\x04\0\x02\x02\x12\x03\x1f\x08\"\"\x1d\x20multihash\x20of\x20the\
    \x20public\x20key\n\n\x0c\n\x05\x04\0\x02\x02\x05\x12\x03\x1f\x08\r\n\
    \x0c\n\x05\x04\0\x02\x02\x01\x12\x03\x1f\x0e\x1d\n\x0c\n\x05\x04\0\x02\
    \x02\x03\x12\x03\x1f\x20!\nl\n\x02\x05\0\x12\x04#\0(\x01\x1a`\x20We\x20n\
    eed\x20to\x20leave\x20the\x203\x20first\x20bits\x20for\x20the\x20Network\
    Type\x20and\x20can\x20use\x20the\x20rest\x20for\x20the\x20AccountType\n\
    \n\n\n\x03\x05\0\x01\x12\x03#\x05\x10\n%\n\x04\x05\0\x02\0\x12\x03$\x04\
    \x1d\"\x18\x20Un-known\x20account\x20type.\n\n\x0c\n\x05\x05\0\x02\0\x01\
    \x12\x03$\x04\x18\n\x0c\n\x05\x05\0\x02\0\x02\x12\x03$\x1b\x1c\n#\n\x04\
    \x05\0\x02\x01\x12\x03%\x04\x17\"\x16\x20Public\x20account\x20type.\n\n\
    \x0c\n\x05\x05\0\x02\x01\x01\x12\x03%\x04\x12\n\x0c\n\x05\x05\0\x02\x01\
    \x02\x12\x03%\x15\x16\n)\n\x04\x05\0\x02\x02\x12\x03&\x04\x1e\"\x1c\x20C\
    onfidential\x20account\x20type.\n\n\x0c\n\x05\x05\0\x02\x02\x01\x12\x03&\
    \x04\x18\n\x0c\n\x05\x05\0\x02\x02\x02\x12\x03&\x1b\x1d\n?\n\x04\x05\0\
    \x02\x03\x12\x03'\x04\x20\"2\x20Smart\x20contract\x20account\x20type\x20\
    {TO\x20BE\x20DEPRECATED}.\x20\n\n\x0c\n\x05\x05\0\x02\x03\x01\x12\x03'\
    \x04\x1a\n\x0c\n\x05\x05\0\x02\x03\x02\x12\x03'\x1d\x1fb\x06proto3\
";

static mut file_descriptor_proto_lazy: ::protobuf::lazy::Lazy<::protobuf::descriptor::FileDescriptorProto> = ::protobuf::lazy::Lazy {
    lock: ::protobuf::lazy::ONCE_INIT,
    ptr: 0 as *const ::protobuf::descriptor::FileDescriptorProto,
};

fn parse_descriptor_proto() -> ::protobuf::descriptor::FileDescriptorProto {
    ::protobuf::parse_from_bytes(file_descriptor_proto_data).unwrap()
}

pub fn file_descriptor_proto() -> &'static ::protobuf::descriptor::FileDescriptorProto {
    unsafe {
        file_descriptor_proto_lazy.get(|| {
            parse_descriptor_proto()
        })
    }
}
