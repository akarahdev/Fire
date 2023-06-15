package dev.ashli.fire.parser.complete.expression.value

import dev.ashli.fire.parser.error.MissingTokenError
import dev.ashli.fire.parser.error.ParseTokenError
import dev.ashli.fire.tokenizer.TokenType
import dev.ashli.fire.tokenizer.Tokens

/**
 * Represents a "this" value.
 */
class This {
    companion object {
        fun parse(tokens: Tokens): This {
            if (!tokens.hasNext()) throw MissingTokenError("No token to parse.", tokens)
            val token = tokens.next()
            if (token.type !is TokenType.This) throw ParseTokenError("Token is not a 'this' keyword.", token)
            return This()
        }
    }
}