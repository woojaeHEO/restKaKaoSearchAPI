package com.exp.booksearchapp

import com.exp.booksearchapp.data.db.BookSearchDaoTest
import com.exp.booksearchapp.ui.view.MainActivityTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@ExperimentalCoroutinesApi
@Suite.SuiteClasses(
    MainActivityTest::class,
    BookSearchDaoTest::class,
)
class InstrumentedTestSuite