package com.sekiya9311.becauseyousaywhereareyounow.di

import com.sekiya9311.becauseyousaywhereareyounow.repository.interfaces.MailRepository
import dagger.Binds
import dagger.Module

@Module
interface RepositoryModule {

    @Binds
    fun bindMailRepository(
        mailRepository: MailRepository
    ) : MailRepository

}
