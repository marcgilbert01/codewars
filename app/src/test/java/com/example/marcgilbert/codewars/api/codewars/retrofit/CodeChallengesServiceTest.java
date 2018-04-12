package com.example.marcgilbert.codewars.api.codewars.retrofit;

import com.example.marcgilbert.codewars.api.codewars.pojos.Challenge;
import com.example.marcgilbert.codewars.api.codewars.pojos.CompletedChallenge;
import com.example.marcgilbert.codewars.api.codewars.pojos.CompletedChallenges;
import com.example.marcgilbert.codewars.api.codewars.pojos.Member;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

import retrofit2.Response;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

public class CodeChallengesServiceTest {

    private final String URL = "https://www.codewars.com";
    private final String API_KEY = "5vkCG4da_dyaT9X3QXpi";
    private final String SPENCER = "spencerwi";
    private final String MARC = "marcgilbert01";

    private CodeChallengesService mCodeChallengesService;

    @Before
    public void setUp() throws Exception {
        mCodeChallengesService = RetrofitClient.getClient(URL).create(CodeChallengesService.class);
    }

    @Test
    public void test_getMember_givenUserName_thenReturnMember() throws IOException {
        Response<Member> response = mCodeChallengesService.getMember(MARC, API_KEY).execute();
        Member member = response.body();

        assertThat(member, is(notNullValue()));
        assertThat(member.getName(), is("Marc Gilbert"));
        assertThat(member.getUsername(), is("marcgilbert01"));
        // TODO more to check here
    }

    @Test
    public void test_getCompletedChallenges_thenReturnListOfCompletedChallenges() throws IOException {
        Response<CompletedChallenges> response = mCodeChallengesService.getCompletedChallenges(SPENCER, 0, API_KEY).execute();
        CompletedChallenges completedChallenges = response.body();

        assertThat(completedChallenges, is(notNullValue()));
        assertThat(completedChallenges.getData(), is(CoreMatchers.<CompletedChallenge[]>notNullValue()));
        assertThat(completedChallenges.getData().length, greaterThan(0));
        // TODO more to check
    }

    @Test
    public void test_getChallenge_givenChallengeId_thenReturnChallengeId() throws IOException {
        Response<Challenge> response = mCodeChallengesService.getChallenge("ones-and-zeros", API_KEY).execute();
        Challenge challenge = response.body();

        assertThat(challenge, is(CoreMatchers.<Challenge>notNullValue()));
        assertThat(challenge.getDescription(), is(CoreMatchers.<String>notNullValue()));
        assertThat(challenge.getDescription().length(), greaterThan(1));
        // TODO more to check
    }
}
