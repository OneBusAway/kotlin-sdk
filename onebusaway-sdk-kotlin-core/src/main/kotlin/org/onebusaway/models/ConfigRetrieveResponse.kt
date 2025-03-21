// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import org.onebusaway.core.ExcludeMissing
import org.onebusaway.core.JsonField
import org.onebusaway.core.JsonMissing
import org.onebusaway.core.JsonValue
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.checkRequired
import org.onebusaway.core.immutableEmptyMap
import org.onebusaway.core.toImmutable

@NoAutoDetect
class ConfigRetrieveResponse
@JsonCreator
private constructor(
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("currentTime")
    @ExcludeMissing
    private val currentTime: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("text") @ExcludeMissing private val text: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<Data> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun code(): Long = code.getRequired("code")

    fun currentTime(): Long = currentTime.getRequired("currentTime")

    fun text(): String = text.getRequired("text")

    fun version(): Long = version.getRequired("version")

    fun data(): Data = data.getRequired("data")

    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Long> = code

    @JsonProperty("currentTime") @ExcludeMissing fun _currentTime(): JsonField<Long> = currentTime

    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun toResponseWrapper(): ResponseWrapper =
        ResponseWrapper.builder()
            .code(code)
            .currentTime(currentTime)
            .text(text)
            .version(version)
            .build()

    private var validated: Boolean = false

    fun validate(): ConfigRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        code()
        currentTime()
        text()
        version()
        data().validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ConfigRetrieveResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .code()
         * .currentTime()
         * .text()
         * .version()
         * .data()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ConfigRetrieveResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long>? = null
        private var currentTime: JsonField<Long>? = null
        private var text: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(configRetrieveResponse: ConfigRetrieveResponse) = apply {
            code = configRetrieveResponse.code
            currentTime = configRetrieveResponse.currentTime
            text = configRetrieveResponse.text
            version = configRetrieveResponse.version
            data = configRetrieveResponse.data
            additionalProperties = configRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun code(code: Long) = code(JsonField.of(code))

        fun code(code: JsonField<Long>) = apply { this.code = code }

        fun currentTime(currentTime: Long) = currentTime(JsonField.of(currentTime))

        fun currentTime(currentTime: JsonField<Long>) = apply { this.currentTime = currentTime }

        fun text(text: String) = text(JsonField.of(text))

        fun text(text: JsonField<String>) = apply { this.text = text }

        fun version(version: Long) = version(JsonField.of(version))

        fun version(version: JsonField<Long>) = apply { this.version = version }

        fun data(data: Data) = data(JsonField.of(data))

        fun data(data: JsonField<Data>) = apply { this.data = data }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): ConfigRetrieveResponse =
            ConfigRetrieveResponse(
                checkRequired("code", code),
                checkRequired("currentTime", currentTime),
                checkRequired("text", text),
                checkRequired("version", version),
                checkRequired("data", data),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("entry")
        @ExcludeMissing
        private val entry: JsonField<Entry> = JsonMissing.of(),
        @JsonProperty("references")
        @ExcludeMissing
        private val references: JsonField<References> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun entry(): Entry = entry.getRequired("entry")

        fun references(): References = references.getRequired("references")

        @JsonProperty("entry") @ExcludeMissing fun _entry(): JsonField<Entry> = entry

        @JsonProperty("references")
        @ExcludeMissing
        fun _references(): JsonField<References> = references

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            entry().validate()
            references().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```kotlin
             * .entry()
             * .references()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var entry: JsonField<Entry>? = null
            private var references: JsonField<References>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                entry = data.entry
                references = data.references
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun entry(entry: Entry) = entry(JsonField.of(entry))

            fun entry(entry: JsonField<Entry>) = apply { this.entry = entry }

            fun references(references: References) = references(JsonField.of(references))

            fun references(references: JsonField<References>) = apply {
                this.references = references
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Data =
                Data(
                    checkRequired("entry", entry),
                    checkRequired("references", references),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Entry
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gitProperties")
            @ExcludeMissing
            private val gitProperties: JsonField<GitProperties> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("serviceDateFrom")
            @ExcludeMissing
            private val serviceDateFrom: JsonField<String> = JsonMissing.of(),
            @JsonProperty("serviceDateTo")
            @ExcludeMissing
            private val serviceDateTo: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String? = id.getNullable("id")

            fun gitProperties(): GitProperties? = gitProperties.getNullable("gitProperties")

            fun name(): String? = name.getNullable("name")

            fun serviceDateFrom(): String? = serviceDateFrom.getNullable("serviceDateFrom")

            fun serviceDateTo(): String? = serviceDateTo.getNullable("serviceDateTo")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("gitProperties")
            @ExcludeMissing
            fun _gitProperties(): JsonField<GitProperties> = gitProperties

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonProperty("serviceDateFrom")
            @ExcludeMissing
            fun _serviceDateFrom(): JsonField<String> = serviceDateFrom

            @JsonProperty("serviceDateTo")
            @ExcludeMissing
            fun _serviceDateTo(): JsonField<String> = serviceDateTo

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Entry = apply {
                if (validated) {
                    return@apply
                }

                id()
                gitProperties()?.validate()
                name()
                serviceDateFrom()
                serviceDateTo()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Entry]. */
                fun builder() = Builder()
            }

            /** A builder for [Entry]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var gitProperties: JsonField<GitProperties> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var serviceDateFrom: JsonField<String> = JsonMissing.of()
                private var serviceDateTo: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(entry: Entry) = apply {
                    id = entry.id
                    gitProperties = entry.gitProperties
                    name = entry.name
                    serviceDateFrom = entry.serviceDateFrom
                    serviceDateTo = entry.serviceDateTo
                    additionalProperties = entry.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun gitProperties(gitProperties: GitProperties) =
                    gitProperties(JsonField.of(gitProperties))

                fun gitProperties(gitProperties: JsonField<GitProperties>) = apply {
                    this.gitProperties = gitProperties
                }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun serviceDateFrom(serviceDateFrom: String) =
                    serviceDateFrom(JsonField.of(serviceDateFrom))

                fun serviceDateFrom(serviceDateFrom: JsonField<String>) = apply {
                    this.serviceDateFrom = serviceDateFrom
                }

                fun serviceDateTo(serviceDateTo: String) =
                    serviceDateTo(JsonField.of(serviceDateTo))

                fun serviceDateTo(serviceDateTo: JsonField<String>) = apply {
                    this.serviceDateTo = serviceDateTo
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Entry =
                    Entry(
                        id,
                        gitProperties,
                        name,
                        serviceDateFrom,
                        serviceDateTo,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class GitProperties
            @JsonCreator
            private constructor(
                @JsonProperty("git.branch")
                @ExcludeMissing
                private val gitBranch: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.build.host")
                @ExcludeMissing
                private val gitBuildHost: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.build.time")
                @ExcludeMissing
                private val gitBuildTime: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.build.user.email")
                @ExcludeMissing
                private val gitBuildUserEmail: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.build.user.name")
                @ExcludeMissing
                private val gitBuildUserName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.build.version")
                @ExcludeMissing
                private val gitBuildVersion: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.closest.tag.commit.count")
                @ExcludeMissing
                private val gitClosestTagCommitCount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.closest.tag.name")
                @ExcludeMissing
                private val gitClosestTagName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.commit.id")
                @ExcludeMissing
                private val gitCommitId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.commit.id.abbrev")
                @ExcludeMissing
                private val gitCommitIdAbbrev: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.commit.id.describe")
                @ExcludeMissing
                private val gitCommitIdDescribe: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.commit.id.describe-short")
                @ExcludeMissing
                private val gitCommitIdDescribeShort: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.commit.message.full")
                @ExcludeMissing
                private val gitCommitMessageFull: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.commit.message.short")
                @ExcludeMissing
                private val gitCommitMessageShort: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.commit.time")
                @ExcludeMissing
                private val gitCommitTime: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.commit.user.email")
                @ExcludeMissing
                private val gitCommitUserEmail: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.commit.user.name")
                @ExcludeMissing
                private val gitCommitUserName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.dirty")
                @ExcludeMissing
                private val gitDirty: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.remote.origin.url")
                @ExcludeMissing
                private val gitRemoteOriginUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.tags")
                @ExcludeMissing
                private val gitTags: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun gitBranch(): String? = gitBranch.getNullable("git.branch")

                fun gitBuildHost(): String? = gitBuildHost.getNullable("git.build.host")

                fun gitBuildTime(): String? = gitBuildTime.getNullable("git.build.time")

                fun gitBuildUserEmail(): String? =
                    gitBuildUserEmail.getNullable("git.build.user.email")

                fun gitBuildUserName(): String? =
                    gitBuildUserName.getNullable("git.build.user.name")

                fun gitBuildVersion(): String? = gitBuildVersion.getNullable("git.build.version")

                fun gitClosestTagCommitCount(): String? =
                    gitClosestTagCommitCount.getNullable("git.closest.tag.commit.count")

                fun gitClosestTagName(): String? =
                    gitClosestTagName.getNullable("git.closest.tag.name")

                fun gitCommitId(): String? = gitCommitId.getNullable("git.commit.id")

                fun gitCommitIdAbbrev(): String? =
                    gitCommitIdAbbrev.getNullable("git.commit.id.abbrev")

                fun gitCommitIdDescribe(): String? =
                    gitCommitIdDescribe.getNullable("git.commit.id.describe")

                fun gitCommitIdDescribeShort(): String? =
                    gitCommitIdDescribeShort.getNullable("git.commit.id.describe-short")

                fun gitCommitMessageFull(): String? =
                    gitCommitMessageFull.getNullable("git.commit.message.full")

                fun gitCommitMessageShort(): String? =
                    gitCommitMessageShort.getNullable("git.commit.message.short")

                fun gitCommitTime(): String? = gitCommitTime.getNullable("git.commit.time")

                fun gitCommitUserEmail(): String? =
                    gitCommitUserEmail.getNullable("git.commit.user.email")

                fun gitCommitUserName(): String? =
                    gitCommitUserName.getNullable("git.commit.user.name")

                fun gitDirty(): String? = gitDirty.getNullable("git.dirty")

                fun gitRemoteOriginUrl(): String? =
                    gitRemoteOriginUrl.getNullable("git.remote.origin.url")

                fun gitTags(): String? = gitTags.getNullable("git.tags")

                @JsonProperty("git.branch")
                @ExcludeMissing
                fun _gitBranch(): JsonField<String> = gitBranch

                @JsonProperty("git.build.host")
                @ExcludeMissing
                fun _gitBuildHost(): JsonField<String> = gitBuildHost

                @JsonProperty("git.build.time")
                @ExcludeMissing
                fun _gitBuildTime(): JsonField<String> = gitBuildTime

                @JsonProperty("git.build.user.email")
                @ExcludeMissing
                fun _gitBuildUserEmail(): JsonField<String> = gitBuildUserEmail

                @JsonProperty("git.build.user.name")
                @ExcludeMissing
                fun _gitBuildUserName(): JsonField<String> = gitBuildUserName

                @JsonProperty("git.build.version")
                @ExcludeMissing
                fun _gitBuildVersion(): JsonField<String> = gitBuildVersion

                @JsonProperty("git.closest.tag.commit.count")
                @ExcludeMissing
                fun _gitClosestTagCommitCount(): JsonField<String> = gitClosestTagCommitCount

                @JsonProperty("git.closest.tag.name")
                @ExcludeMissing
                fun _gitClosestTagName(): JsonField<String> = gitClosestTagName

                @JsonProperty("git.commit.id")
                @ExcludeMissing
                fun _gitCommitId(): JsonField<String> = gitCommitId

                @JsonProperty("git.commit.id.abbrev")
                @ExcludeMissing
                fun _gitCommitIdAbbrev(): JsonField<String> = gitCommitIdAbbrev

                @JsonProperty("git.commit.id.describe")
                @ExcludeMissing
                fun _gitCommitIdDescribe(): JsonField<String> = gitCommitIdDescribe

                @JsonProperty("git.commit.id.describe-short")
                @ExcludeMissing
                fun _gitCommitIdDescribeShort(): JsonField<String> = gitCommitIdDescribeShort

                @JsonProperty("git.commit.message.full")
                @ExcludeMissing
                fun _gitCommitMessageFull(): JsonField<String> = gitCommitMessageFull

                @JsonProperty("git.commit.message.short")
                @ExcludeMissing
                fun _gitCommitMessageShort(): JsonField<String> = gitCommitMessageShort

                @JsonProperty("git.commit.time")
                @ExcludeMissing
                fun _gitCommitTime(): JsonField<String> = gitCommitTime

                @JsonProperty("git.commit.user.email")
                @ExcludeMissing
                fun _gitCommitUserEmail(): JsonField<String> = gitCommitUserEmail

                @JsonProperty("git.commit.user.name")
                @ExcludeMissing
                fun _gitCommitUserName(): JsonField<String> = gitCommitUserName

                @JsonProperty("git.dirty")
                @ExcludeMissing
                fun _gitDirty(): JsonField<String> = gitDirty

                @JsonProperty("git.remote.origin.url")
                @ExcludeMissing
                fun _gitRemoteOriginUrl(): JsonField<String> = gitRemoteOriginUrl

                @JsonProperty("git.tags")
                @ExcludeMissing
                fun _gitTags(): JsonField<String> = gitTags

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): GitProperties = apply {
                    if (validated) {
                        return@apply
                    }

                    gitBranch()
                    gitBuildHost()
                    gitBuildTime()
                    gitBuildUserEmail()
                    gitBuildUserName()
                    gitBuildVersion()
                    gitClosestTagCommitCount()
                    gitClosestTagName()
                    gitCommitId()
                    gitCommitIdAbbrev()
                    gitCommitIdDescribe()
                    gitCommitIdDescribeShort()
                    gitCommitMessageFull()
                    gitCommitMessageShort()
                    gitCommitTime()
                    gitCommitUserEmail()
                    gitCommitUserName()
                    gitDirty()
                    gitRemoteOriginUrl()
                    gitTags()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [GitProperties].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [GitProperties]. */
                class Builder internal constructor() {

                    private var gitBranch: JsonField<String> = JsonMissing.of()
                    private var gitBuildHost: JsonField<String> = JsonMissing.of()
                    private var gitBuildTime: JsonField<String> = JsonMissing.of()
                    private var gitBuildUserEmail: JsonField<String> = JsonMissing.of()
                    private var gitBuildUserName: JsonField<String> = JsonMissing.of()
                    private var gitBuildVersion: JsonField<String> = JsonMissing.of()
                    private var gitClosestTagCommitCount: JsonField<String> = JsonMissing.of()
                    private var gitClosestTagName: JsonField<String> = JsonMissing.of()
                    private var gitCommitId: JsonField<String> = JsonMissing.of()
                    private var gitCommitIdAbbrev: JsonField<String> = JsonMissing.of()
                    private var gitCommitIdDescribe: JsonField<String> = JsonMissing.of()
                    private var gitCommitIdDescribeShort: JsonField<String> = JsonMissing.of()
                    private var gitCommitMessageFull: JsonField<String> = JsonMissing.of()
                    private var gitCommitMessageShort: JsonField<String> = JsonMissing.of()
                    private var gitCommitTime: JsonField<String> = JsonMissing.of()
                    private var gitCommitUserEmail: JsonField<String> = JsonMissing.of()
                    private var gitCommitUserName: JsonField<String> = JsonMissing.of()
                    private var gitDirty: JsonField<String> = JsonMissing.of()
                    private var gitRemoteOriginUrl: JsonField<String> = JsonMissing.of()
                    private var gitTags: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(gitProperties: GitProperties) = apply {
                        gitBranch = gitProperties.gitBranch
                        gitBuildHost = gitProperties.gitBuildHost
                        gitBuildTime = gitProperties.gitBuildTime
                        gitBuildUserEmail = gitProperties.gitBuildUserEmail
                        gitBuildUserName = gitProperties.gitBuildUserName
                        gitBuildVersion = gitProperties.gitBuildVersion
                        gitClosestTagCommitCount = gitProperties.gitClosestTagCommitCount
                        gitClosestTagName = gitProperties.gitClosestTagName
                        gitCommitId = gitProperties.gitCommitId
                        gitCommitIdAbbrev = gitProperties.gitCommitIdAbbrev
                        gitCommitIdDescribe = gitProperties.gitCommitIdDescribe
                        gitCommitIdDescribeShort = gitProperties.gitCommitIdDescribeShort
                        gitCommitMessageFull = gitProperties.gitCommitMessageFull
                        gitCommitMessageShort = gitProperties.gitCommitMessageShort
                        gitCommitTime = gitProperties.gitCommitTime
                        gitCommitUserEmail = gitProperties.gitCommitUserEmail
                        gitCommitUserName = gitProperties.gitCommitUserName
                        gitDirty = gitProperties.gitDirty
                        gitRemoteOriginUrl = gitProperties.gitRemoteOriginUrl
                        gitTags = gitProperties.gitTags
                        additionalProperties = gitProperties.additionalProperties.toMutableMap()
                    }

                    fun gitBranch(gitBranch: String) = gitBranch(JsonField.of(gitBranch))

                    fun gitBranch(gitBranch: JsonField<String>) = apply {
                        this.gitBranch = gitBranch
                    }

                    fun gitBuildHost(gitBuildHost: String) =
                        gitBuildHost(JsonField.of(gitBuildHost))

                    fun gitBuildHost(gitBuildHost: JsonField<String>) = apply {
                        this.gitBuildHost = gitBuildHost
                    }

                    fun gitBuildTime(gitBuildTime: String) =
                        gitBuildTime(JsonField.of(gitBuildTime))

                    fun gitBuildTime(gitBuildTime: JsonField<String>) = apply {
                        this.gitBuildTime = gitBuildTime
                    }

                    fun gitBuildUserEmail(gitBuildUserEmail: String) =
                        gitBuildUserEmail(JsonField.of(gitBuildUserEmail))

                    fun gitBuildUserEmail(gitBuildUserEmail: JsonField<String>) = apply {
                        this.gitBuildUserEmail = gitBuildUserEmail
                    }

                    fun gitBuildUserName(gitBuildUserName: String) =
                        gitBuildUserName(JsonField.of(gitBuildUserName))

                    fun gitBuildUserName(gitBuildUserName: JsonField<String>) = apply {
                        this.gitBuildUserName = gitBuildUserName
                    }

                    fun gitBuildVersion(gitBuildVersion: String) =
                        gitBuildVersion(JsonField.of(gitBuildVersion))

                    fun gitBuildVersion(gitBuildVersion: JsonField<String>) = apply {
                        this.gitBuildVersion = gitBuildVersion
                    }

                    fun gitClosestTagCommitCount(gitClosestTagCommitCount: String) =
                        gitClosestTagCommitCount(JsonField.of(gitClosestTagCommitCount))

                    fun gitClosestTagCommitCount(gitClosestTagCommitCount: JsonField<String>) =
                        apply {
                            this.gitClosestTagCommitCount = gitClosestTagCommitCount
                        }

                    fun gitClosestTagName(gitClosestTagName: String) =
                        gitClosestTagName(JsonField.of(gitClosestTagName))

                    fun gitClosestTagName(gitClosestTagName: JsonField<String>) = apply {
                        this.gitClosestTagName = gitClosestTagName
                    }

                    fun gitCommitId(gitCommitId: String) = gitCommitId(JsonField.of(gitCommitId))

                    fun gitCommitId(gitCommitId: JsonField<String>) = apply {
                        this.gitCommitId = gitCommitId
                    }

                    fun gitCommitIdAbbrev(gitCommitIdAbbrev: String) =
                        gitCommitIdAbbrev(JsonField.of(gitCommitIdAbbrev))

                    fun gitCommitIdAbbrev(gitCommitIdAbbrev: JsonField<String>) = apply {
                        this.gitCommitIdAbbrev = gitCommitIdAbbrev
                    }

                    fun gitCommitIdDescribe(gitCommitIdDescribe: String) =
                        gitCommitIdDescribe(JsonField.of(gitCommitIdDescribe))

                    fun gitCommitIdDescribe(gitCommitIdDescribe: JsonField<String>) = apply {
                        this.gitCommitIdDescribe = gitCommitIdDescribe
                    }

                    fun gitCommitIdDescribeShort(gitCommitIdDescribeShort: String) =
                        gitCommitIdDescribeShort(JsonField.of(gitCommitIdDescribeShort))

                    fun gitCommitIdDescribeShort(gitCommitIdDescribeShort: JsonField<String>) =
                        apply {
                            this.gitCommitIdDescribeShort = gitCommitIdDescribeShort
                        }

                    fun gitCommitMessageFull(gitCommitMessageFull: String) =
                        gitCommitMessageFull(JsonField.of(gitCommitMessageFull))

                    fun gitCommitMessageFull(gitCommitMessageFull: JsonField<String>) = apply {
                        this.gitCommitMessageFull = gitCommitMessageFull
                    }

                    fun gitCommitMessageShort(gitCommitMessageShort: String) =
                        gitCommitMessageShort(JsonField.of(gitCommitMessageShort))

                    fun gitCommitMessageShort(gitCommitMessageShort: JsonField<String>) = apply {
                        this.gitCommitMessageShort = gitCommitMessageShort
                    }

                    fun gitCommitTime(gitCommitTime: String) =
                        gitCommitTime(JsonField.of(gitCommitTime))

                    fun gitCommitTime(gitCommitTime: JsonField<String>) = apply {
                        this.gitCommitTime = gitCommitTime
                    }

                    fun gitCommitUserEmail(gitCommitUserEmail: String) =
                        gitCommitUserEmail(JsonField.of(gitCommitUserEmail))

                    fun gitCommitUserEmail(gitCommitUserEmail: JsonField<String>) = apply {
                        this.gitCommitUserEmail = gitCommitUserEmail
                    }

                    fun gitCommitUserName(gitCommitUserName: String) =
                        gitCommitUserName(JsonField.of(gitCommitUserName))

                    fun gitCommitUserName(gitCommitUserName: JsonField<String>) = apply {
                        this.gitCommitUserName = gitCommitUserName
                    }

                    fun gitDirty(gitDirty: String) = gitDirty(JsonField.of(gitDirty))

                    fun gitDirty(gitDirty: JsonField<String>) = apply { this.gitDirty = gitDirty }

                    fun gitRemoteOriginUrl(gitRemoteOriginUrl: String) =
                        gitRemoteOriginUrl(JsonField.of(gitRemoteOriginUrl))

                    fun gitRemoteOriginUrl(gitRemoteOriginUrl: JsonField<String>) = apply {
                        this.gitRemoteOriginUrl = gitRemoteOriginUrl
                    }

                    fun gitTags(gitTags: String) = gitTags(JsonField.of(gitTags))

                    fun gitTags(gitTags: JsonField<String>) = apply { this.gitTags = gitTags }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): GitProperties =
                        GitProperties(
                            gitBranch,
                            gitBuildHost,
                            gitBuildTime,
                            gitBuildUserEmail,
                            gitBuildUserName,
                            gitBuildVersion,
                            gitClosestTagCommitCount,
                            gitClosestTagName,
                            gitCommitId,
                            gitCommitIdAbbrev,
                            gitCommitIdDescribe,
                            gitCommitIdDescribeShort,
                            gitCommitMessageFull,
                            gitCommitMessageShort,
                            gitCommitTime,
                            gitCommitUserEmail,
                            gitCommitUserName,
                            gitDirty,
                            gitRemoteOriginUrl,
                            gitTags,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is GitProperties && gitBranch == other.gitBranch && gitBuildHost == other.gitBuildHost && gitBuildTime == other.gitBuildTime && gitBuildUserEmail == other.gitBuildUserEmail && gitBuildUserName == other.gitBuildUserName && gitBuildVersion == other.gitBuildVersion && gitClosestTagCommitCount == other.gitClosestTagCommitCount && gitClosestTagName == other.gitClosestTagName && gitCommitId == other.gitCommitId && gitCommitIdAbbrev == other.gitCommitIdAbbrev && gitCommitIdDescribe == other.gitCommitIdDescribe && gitCommitIdDescribeShort == other.gitCommitIdDescribeShort && gitCommitMessageFull == other.gitCommitMessageFull && gitCommitMessageShort == other.gitCommitMessageShort && gitCommitTime == other.gitCommitTime && gitCommitUserEmail == other.gitCommitUserEmail && gitCommitUserName == other.gitCommitUserName && gitDirty == other.gitDirty && gitRemoteOriginUrl == other.gitRemoteOriginUrl && gitTags == other.gitTags && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(gitBranch, gitBuildHost, gitBuildTime, gitBuildUserEmail, gitBuildUserName, gitBuildVersion, gitClosestTagCommitCount, gitClosestTagName, gitCommitId, gitCommitIdAbbrev, gitCommitIdDescribe, gitCommitIdDescribeShort, gitCommitMessageFull, gitCommitMessageShort, gitCommitTime, gitCommitUserEmail, gitCommitUserName, gitDirty, gitRemoteOriginUrl, gitTags, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "GitProperties{gitBranch=$gitBranch, gitBuildHost=$gitBuildHost, gitBuildTime=$gitBuildTime, gitBuildUserEmail=$gitBuildUserEmail, gitBuildUserName=$gitBuildUserName, gitBuildVersion=$gitBuildVersion, gitClosestTagCommitCount=$gitClosestTagCommitCount, gitClosestTagName=$gitClosestTagName, gitCommitId=$gitCommitId, gitCommitIdAbbrev=$gitCommitIdAbbrev, gitCommitIdDescribe=$gitCommitIdDescribe, gitCommitIdDescribeShort=$gitCommitIdDescribeShort, gitCommitMessageFull=$gitCommitMessageFull, gitCommitMessageShort=$gitCommitMessageShort, gitCommitTime=$gitCommitTime, gitCommitUserEmail=$gitCommitUserEmail, gitCommitUserName=$gitCommitUserName, gitDirty=$gitDirty, gitRemoteOriginUrl=$gitRemoteOriginUrl, gitTags=$gitTags, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Entry && id == other.id && gitProperties == other.gitProperties && name == other.name && serviceDateFrom == other.serviceDateFrom && serviceDateTo == other.serviceDateTo && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, gitProperties, name, serviceDateFrom, serviceDateTo, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entry{id=$id, gitProperties=$gitProperties, name=$name, serviceDateFrom=$serviceDateFrom, serviceDateTo=$serviceDateTo, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && entry == other.entry && references == other.references && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(entry, references, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{entry=$entry, references=$references, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ConfigRetrieveResponse && code == other.code && currentTime == other.currentTime && text == other.text && version == other.version && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, currentTime, text, version, data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConfigRetrieveResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
