package com.muratozturk.conversai.common

object Constants {
    const val BASE_URL = "https://api.openai.com/v1/"
    const val API_KEY = "Place your API key here"

    const val REWARDED_AD_UNIT_ID =
        "Place your rewarded ad unit id here"

    const val TRANSITION_ANIMATION_DURATION = 3000


    object Preferences {
        const val LANGUAGE_CODE = "languageCode"
        const val LANGUAGE_NAME = "languageName"
        const val SHARED_PREF_NAME = "mova_shared_pref"
        const val DARK_MODE = "darkMode"
        const val PRO_VERSION = "proVersion"
        const val FIRST_TIME = "firstTime"
        const val FREE_MESSAGE_COUNT = "freeMessageCount"
        const val FREE_MESSAGE_LAST_CHECKED_TIME = "freeMessageLastCheckedTime"
        const val FREE_MESSAGE_COUNT_DEFAULT = 10
        const val INCREASE_MESSAGE_COUNT = 1
    }

    object Queries {
        const val GET_CONVERSATIONS = "SELECT * FROM conversations ORDER BY createdAt DESC"
        const val DELETE_CONVERSATION = "DELETE FROM conversations WHERE id = :id"
        const val DELETE_ALL_CONVERSATION = "DELETE FROM conversations"
        const val DELETE_MESSAGES = "DELETE FROM messages WHERE conversationId = :conversationId"
        const val GET_MESSAGES =
            "SELECT * FROM messages WHERE conversationId = :conversationId ORDER BY createdAt DESC"

    }

}