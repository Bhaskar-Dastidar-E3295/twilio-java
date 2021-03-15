/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import com.twilio.twiml.TwiML;

import java.util.HashMap;
import java.util.Map;

/**
 * TwiML wrapper for {@code <VirtualAgent>}
 */
public class VirtualAgent extends TwiML {
    private final String connectorName;
    private final String language;
    private final Boolean sentimentAnalysis;
    private final String statusCallback;

    /**
     * For XML Serialization/Deserialization
     */
    private VirtualAgent() {
        this(new Builder());
    }

    /**
     * Create a new {@code <VirtualAgent>} element
     */
    private VirtualAgent(Builder b) {
        super("VirtualAgent", b);
        this.connectorName = b.connectorName;
        this.language = b.language;
        this.sentimentAnalysis = b.sentimentAnalysis;
        this.statusCallback = b.statusCallback;
    }

    /**
     * Attributes to set on the generated XML element
     *
     * @return A Map of attribute keys to values
     */
    protected Map<String, String> getElementAttributes() {
        // Preserve order of attributes
        Map<String, String> attrs = new HashMap<>();

        if (this.getConnectorName() != null) {
            attrs.put("connectorName", this.getConnectorName());
        }
        if (this.getLanguage() != null) {
            attrs.put("language", this.getLanguage());
        }
        if (this.isSentimentAnalysis() != null) {
            attrs.put("sentimentAnalysis", this.isSentimentAnalysis().toString());
        }
        if (this.getStatusCallback() != null) {
            attrs.put("statusCallback", this.getStatusCallback());
        }

        return attrs;
    }

    /**
     * Defines the conversation profile Dialogflow needs to use
     *
     * @return Defines the conversation profile Dialogflow needs to use
     */
    public String getConnectorName() {
        return connectorName;
    }

    /**
     * Language to be used by Dialogflow to transcribe speech
     *
     * @return Language to be used by Dialogflow to transcribe speech
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Whether sentiment analysis needs to be enabled or not
     *
     * @return Whether sentiment analysis needs to be enabled or not
     */
    public Boolean isSentimentAnalysis() {
        return sentimentAnalysis;
    }

    /**
     * URL to post status callbacks from Twilio
     *
     * @return URL to post status callbacks from Twilio
     */
    public String getStatusCallback() {
        return statusCallback;
    }

    /**
     * Create a new {@code <VirtualAgent>} element
     */
    public static class Builder extends TwiML.Builder<Builder> {
        private String connectorName;
        private String language;
        private Boolean sentimentAnalysis;
        private String statusCallback;

        /**
         * Defines the conversation profile Dialogflow needs to use
         */
        public Builder connectorName(String connectorName) {
            this.connectorName = connectorName;
            return this;
        }

        /**
         * Language to be used by Dialogflow to transcribe speech
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /**
         * Whether sentiment analysis needs to be enabled or not
         */
        public Builder sentimentAnalysis(Boolean sentimentAnalysis) {
            this.sentimentAnalysis = sentimentAnalysis;
            return this;
        }

        /**
         * URL to post status callbacks from Twilio
         */
        public Builder statusCallback(String statusCallback) {
            this.statusCallback = statusCallback;
            return this;
        }

        /**
         * Create and return resulting {@code <VirtualAgent>} element
         */
        public VirtualAgent build() {
            return new VirtualAgent(this);
        }
    }
}