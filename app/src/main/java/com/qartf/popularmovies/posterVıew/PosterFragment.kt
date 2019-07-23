package com.qartf.popularmovies.posterVıew

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.qartf.popularmovies.R
import com.qartf.popularmovies.databinding.FragmentPosterBinding
import com.qartf.popularmovies.movieDetail.MovieDetailViewModel
import com.qartf.popularmovies.utility.extension.getVm

class PosterFragment : Fragment() {

    private val movieDetailViewModel by lazy { getVm<MovieDetailViewModel>() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentPosterBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_poster, container, false
        )
        binding.movieDetailViewModel = movieDetailViewModel
        binding.lifecycleOwner = this
        return binding.root
    }
}