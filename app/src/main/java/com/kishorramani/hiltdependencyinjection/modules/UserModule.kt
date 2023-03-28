package com.kishorramani.hiltdependencyinjection.modules

import com.kishorramani.hiltdependencyinjection.FirebaseRepository
import com.kishorramani.hiltdependencyinjection.SQLRepository
import com.kishorramani.hiltdependencyinjection.UserRepository
import com.kishorramani.hiltdependencyinjection.qualifier.FirebaseQualifier
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Named

/*@InstallIn(ActivityComponent::class)
@Module
abstract class UserModule {
    @Binds
    abstract fun bindUserRepository(sqlRepository: SQLRepository): UserRepository
}*/


@InstallIn(ActivityComponent::class)
@Module
class UserModule {

    @Provides
    @Named("sql")
    fun provideUserRepository(sqlRepository: SQLRepository) : UserRepository {
        return sqlRepository
    }

    @Provides
    @FirebaseQualifier
    fun provideFirebaseRepository() : UserRepository {
        return FirebaseRepository()
    }

}
