<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Transaction.proto

namespace Catalyst\Protocol\Transaction;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>Catalyst.Protocol.Transaction.CoinbaseEntry</code>
 */
class CoinbaseEntry extends \Google\Protobuf\Internal\Message
{
    /**
     * public key behind the address where the Coinbase will be credited
     *
     * Generated from protobuf field <code>bytes receiver_public_key = 1;</code>
     */
    protected $receiver_public_key = '';
    /**
     * uint256 amount
     *
     * Generated from protobuf field <code>bytes amount = 2;</code>
     */
    protected $amount = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $receiver_public_key
     *           public key behind the address where the Coinbase will be credited
     *     @type string $amount
     *           uint256 amount
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Transaction::initOnce();
        parent::__construct($data);
    }

    /**
     * public key behind the address where the Coinbase will be credited
     *
     * Generated from protobuf field <code>bytes receiver_public_key = 1;</code>
     * @return string
     */
    public function getReceiverPublicKey()
    {
        return $this->receiver_public_key;
    }

    /**
     * public key behind the address where the Coinbase will be credited
     *
     * Generated from protobuf field <code>bytes receiver_public_key = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setReceiverPublicKey($var)
    {
        GPBUtil::checkString($var, False);
        $this->receiver_public_key = $var;

        return $this;
    }

    /**
     * uint256 amount
     *
     * Generated from protobuf field <code>bytes amount = 2;</code>
     * @return string
     */
    public function getAmount()
    {
        return $this->amount;
    }

    /**
     * uint256 amount
     *
     * Generated from protobuf field <code>bytes amount = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setAmount($var)
    {
        GPBUtil::checkString($var, False);
        $this->amount = $var;

        return $this;
    }

}

